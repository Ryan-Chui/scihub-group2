# Feature: ra-faculty-hiring-workflow

This feature adds faculty-facing RA hiring workflow enhancements:
1. Faculty can open the RA applicant list from an RA job detail page.
2. Faculty can propose up to three interview time slots when offering an applicant.
3. Applicants receive an in-app push notification when faculty submits interview time slots.

## Database changes

No new tables were added.

Updated table:

- `rajob_application`
  - `interview_slot1` `varchar(255)` (nullable)
  - `interview_slot2` `varchar(255)` (nullable)
  - `interview_slot3` `varchar(255)` (nullable)

Model mapping:

- Backend: `backend/app/models/RAJobApplication.java`
  - `interviewSlot1`, `interviewSlot2`, `interviewSlot3`

Schema location:

- `backend/conf/evolutions/default/1.sql`

## API endpoints

### 1) Update RA application status + interview slots

- **Method:** `POST`
- **URL:** `/rajob/updateRAjobApplicationStatus/:rajobApplicationId`
- **Controller:** `controllers.RAJobController.giveRAJobOffertoStudent`

Request JSON:

```json
{
  "status": "pending",
  "interviewSlot1": "2026-05-01T10:00",
  "interviewSlot2": "",
  "interviewSlot3": "2026-05-02T14:30"
}
```

Notes:

- `status` is required.
- `interviewSlot1..3` are optional.
- Blank/whitespace slot values are normalized to `null`.

Response:

- `200 OK` with updated `RAJobApplication` JSON
- `400 Bad Request` when `status` is missing
- `404 Not Found` when `rajobApplicationId` does not exist

Side effect:

- Creates an in-app notification in `mail` when any interview slot is submitted.

### 2) Get RA application detail

- **Method:** `GET`
- **URL:** `/rajob/rajobApplicationDetail/:rajobApplicationId`
- **Controller:** `controllers.RAJobController.getRAJobApplicationById`

Response example:

```json
{
  "id": 123,
  "status": "pending",
  "interviewSlot1": "2026-05-01T10:00",
  "interviewSlot2": null,
  "interviewSlot3": "2026-05-02T14:30"
}
```

### 3) Send RA offer email with interview slots

- **Method:** `POST`
- **URL:** `/rajob/offer`
- **Controller:** `controllers.RAJobController.sendOfferEmail`

Request JSON:

```json
{
  "rajobApplicationId": 123,
  "ccSelected": "faculty@example.com,coordinator@example.com",
  "interviewSlot1": "2026-05-01T10:00",
  "interviewSlot2": null,
  "interviewSlot3": "2026-05-02T14:30"
}
```

Response:

- `200 OK` (email send attempted; endpoint currently returns OK even if mail send fails)

## Key functions/classes added or updated

Backend:

- `backend/app/utils/InterviewSlotUtils.java` (new)
  - `sanitizeOptionalText(...)`
  - `buildInterviewSlotsMessage(...)`
- `backend/app/controllers/RAJobController.java` (updated)
  - `giveRAJobOffertoStudent(...)` now persists `interviewSlot1..3` and creates push notifications
  - `sendOfferEmail(...)` now reuses persisted interview slot text in the email body
- `backend/app/services/PushNotificationService.java` (new)
  - Shared subject/body builder for push notifications and offer emails
  - Persists in-app notifications as `Mail` rows

Frontend:

- `frontend/app/views/rajobDetail.scala.html` (updated)
  - Adds **View Applicants** entry point for faculty/admin
- `frontend/app/views/rajobApplicationDetail.scala.html` (updated)
  - Displays saved interview slots
  - Adds form inputs for up to 3 interview slots in Offer flow
- `frontend/app/controllers/RAJobController.java` (updated)
  - `rajobApplicationStatusChange(...)` sends interview slots to backend status update and offer email APIs
- `frontend/app/models/RAJobApplication.java` (updated)
  - interview slot fields/getters/setters for UI binding

Tests:

- `backend/test/utils/InterviewSlotUtilsTest.java` (pure unit tests)
- `backend/test/services/PushNotificationServiceTest.java` (pure unit tests)
- `backend/test/controllers/RAJobControllerTest.java` (controller integration tests for slot persistence/validation)
- `backend/test/controllers/RAJobNotificationControllerTest.java` (controller integration tests for notification creation/fetch)
- `backend/test/controllers/RAJobOfferWorkflowE2ETest.java` (E2E-style backend workflow test)

## Known limitations / future improvements

1. Interview slots are stored as `varchar` instead of a timezone-aware datetime type; this can cause formatting/timezone inconsistencies.
2. Slot conflict validation is not implemented (overlap with faculty calendar or previously offered slots is not checked).
3. `/rajob/offer` currently returns `200 OK` even when SMTP send fails; future work should propagate email failure status.
4. The Offer workflow is tested at backend route level; adding browser-level UI E2E coverage would improve confidence.
