# Push Notification System

This project uses the existing `mail` table as its in-app push notification store.

## What triggers a push notification

When a faculty member submits proposed interview time slots for an RA applicant, the backend route below persists the slot data and immediately creates a notification for the applicant:

- Route: `POST /rajob/updateRAjobApplicationStatus/:rajobApplicationId`
- Controller: `backend/app/controllers/RAJobController.java`

The notification is created only when at least one interview slot is present in the request.

## How it works

1. The frontend offer form posts the RA application status and up to three interview slots.
2. `RAJobController.giveRAJobOffertoStudent(...)` trims blank slot values and saves the normalized values to `rajob_application.interview_slot1..3`.
3. The controller calls `PushNotificationService` when any interview slot is present.
4. `PushNotificationService` builds the notification title/body and saves a `Mail` row with:
   - `sender`: the RA job publisher (faculty)
   - `receiver`: the applicant
   - `title`: approval subject line
   - `content`: approval message plus numbered interview slots
5. The frontend notifications page renders those `Mail` records for the logged-in user.

## Email vs push notification

The offer email flow still exists at `POST /rajob/offer`, but it is now separate from push creation:

- Push notification: created on interview-slot submission
- Email: sent afterward when the offer email endpoint is called

Both use the same subject/body builder in `backend/app/services/PushNotificationService.java` so the applicant sees consistent content in-app and over email.

## Main files

- `backend/app/services/PushNotificationService.java`
- `backend/app/controllers/RAJobController.java`
- `backend/app/utils/InterviewSlotUtils.java`
- `backend/app/models/Mail.java`
- `frontend/app/views/notifications.scala.html`

## Tests

Unit tests:

- `backend/test/services/PushNotificationServiceTest.java`
- `backend/test/utils/InterviewSlotUtilsTest.java`

Integration and route-level tests:

- `backend/test/controllers/RAJobControllerTest.java`
- `backend/test/controllers/RAJobNotificationControllerTest.java`
- `backend/test/controllers/RAJobOfferWorkflowE2ETest.java`

## Running the backend tests

From `backend/`, run the focused suite with Java 8:

```bash
JAVA_HOME=/Users/zzyzxstar/Library/Java/JavaVirtualMachines/corretto-1.8.0_482/Contents/Home \
PATH=/Users/zzyzxstar/Library/Java/JavaVirtualMachines/corretto-1.8.0_482/Contents/Home/bin:$PATH \
sbt testOnly services.PushNotificationServiceTest utils.InterviewSlotUtilsTest \
  controllers.RAJobControllerTest controllers.RAJobNotificationControllerTest \
  controllers.RAJobOfferWorkflowE2ETest
```

If you enable JaCoCo in sbt, run `sbt jacoco` from `backend/` to generate a coverage report for the new notification service and related controller paths.
