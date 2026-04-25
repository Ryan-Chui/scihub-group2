# F1 Team 2 Test Report

## Automatic tests

Added backend controller tests for:

- Faculty calendar returns scheduled interviews for a faculty user's RA jobs.
- Rescheduling updates `RAJobApplication.status` to `rescheduled` and replaces the scheduled time.
- Canceling updates `RAJobApplication.status` to `canceled`.
- Existing interview slot persistence tests still cover offer-time slot behavior.

Command to run:

```bash
cd backend
sbt test
```

## Manual tests

Recommended browser flow:

1. Start backend with `cd backend; sbt run`.
2. Start frontend with `cd frontend; sbt run`.
3. Log in as a faculty user.
4. Open **My Posted RAJobs** and click **RA Interview Calendar**.
5. Confirm scheduled interviews for the faculty user's posted RA jobs are listed.
6. Enter a new date/time and optional note, then click **Reschedule**.
7. Confirm the interview row shows the new time and `rescheduled`.
8. Enter an optional cancellation reason and click **Cancel**.
9. Confirm the interview no longer appears in the calendar.

## Results

- `cd backend; sbt test` passed on April 25, 2026. The reschedule test logged an expected email failure because local `system.mail` SMTP settings are not configured; the interview update still saved.
- `cd frontend; sbt test` passed on April 25, 2026.
- `cd backend; sbt run` reached Play startup but failed to bind because port `9037` was already in use.
- `cd frontend; sbt run` reached Play startup but failed to bind because port `9036` was already in use.

Email notification depends on local SMTP configuration; when SMTP is unavailable, the update is still saved and the backend logs the email failure.
