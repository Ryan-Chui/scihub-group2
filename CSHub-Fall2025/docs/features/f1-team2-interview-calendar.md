# F1 Team 2 Interview Calendar

## Summary

This feature adds a faculty-facing RA interview calendar. Faculty can see scheduled interviews for RA jobs they posted, reschedule an interview, or cancel an interview.

## Changed files

- `backend/app/controllers/RAJobController.java`
- `backend/conf/routes`
- `backend/test/controllers/RAJobControllerTest.java`
- `backend/test/controllers/RAJobOfferWorkflowE2ETest.java`
- `backend/test/resources/test-constants.conf`
- `frontend/app/controllers/RAJobController.java`
- `frontend/conf/routes`
- `frontend/app/views/raInterviewCalendar.scala.html`
- `frontend/app/views/rajobListPostedByUser.scala.html`
- `README.md`
- `docs/features/f1-team2-interview-calendar.md`
- `docs/f1-team2-test-report.md`

## Backend routes

- `GET /rajob/interviewCalendar/:facultyId`
  - Returns scheduled and rescheduled RA interviews for RA jobs posted by the faculty user.
- `POST /rajob/interview/:rajobApplicationId/reschedule`
  - Body: `interviewTime`, optional `note`.
  - Updates `RAJobApplication.interviewSlot1`, clears slots 2 and 3, and sets status to `rescheduled`.
- `POST /rajob/interview/:rajobApplicationId/cancel`
  - Body: optional `note`.
  - Sets `RAJobApplication.status` to `canceled`.

## Frontend routes

- `GET /rajob/interviewCalendar`
  - Renders the faculty calendar page for the logged-in user.
- `POST /rajob/interview/:rajobApplicationId/reschedule`
  - Submits a new date/time and optional note.
- `POST /rajob/interview/:rajobApplicationId/cancel`
  - Submits an optional cancellation reason.

## Model changes

No new database columns were added. The implementation reuses existing `RAJobApplication` fields:

- `interviewSlot1` stores the active scheduled/rescheduled interview time.
- `interviewSlot2` and `interviewSlot3` are cleared after rescheduling from the calendar.
- `status` stores `pending`, `rescheduled`, or `canceled`.

## Notification behavior

The backend uses the existing `EmailUtils.sendIndividualEmail(...)` helper to notify the student when an interview is rescheduled or canceled. If SMTP is not configured locally, the database update still succeeds and the response reports `notificationSent: false`.

## Known limitations

- The calendar is a simple table grouped by the interview date column, not a JavaScript calendar widget.
- Optional reschedule notes and cancellation reasons are included in the email notification but are not stored because the existing RA job application model has no note/reason field.
- Only applications with at least one existing interview slot appear in the calendar.

## Test instructions

Run:

```bash
cd backend
sbt test
```

Manual browser check:

1. Start backend on port `9037` and frontend on port `9036`.
2. Log in as a faculty user.
3. Open **My Posted RAJobs**.
4. Click **RA Interview Calendar**.
5. Reschedule an interview and confirm the row shows the new time and `rescheduled`.
6. Cancel an interview and confirm it disappears from the calendar because canceled interviews are filtered out.
