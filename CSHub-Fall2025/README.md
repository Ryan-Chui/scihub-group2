# SMU Scientific Hub

This portal aims to provide an open platform that supports and facilitates collaborations between SMU and local industry. Industry can publish a challenge, and our platform will recommend SMU researcher(s), based on AI, Machine Learning, Deep Learning, Natural Language Processing, Knowledge Graph, and Data Mining techniques.

## Project Overview
This is a frontend-backend separated project, with each running on different ports.

- Frontend Port: `9038`
- Backend Port: `9039`

### How to Run the Project
To run the project, open both the backend and frontend projects and manage them using the sbt shell.

Steps
1. Open the project with the `build.sbt` file.

2. In the sbt shell, enter the following command:

```bash
run
```

This will start the frontend and backend on their respective ports. You can access the landing page by navigating to `http://localhost:9038`.

## Faculty RA applicant review and interview slots

Faculty can now review RA applicants directly from an RA job and propose up to 3 interview slots when sending an offer.

1. Open an RA job detail page and click **View Applicants**.
2. Open an applicant via **View Details**.
3. Click **Offer**, set optional **Interview Slot 1-3**, and submit.
4. The slots are saved on the RA application detail, create an in-app push notification for the applicant, and are included in the offer email.

Push notification design notes and test guidance live in [docs/features/push-notification-system.md](/Users/zzyzxstar/Documents/GitHub/scihub-group2/CSHub-Fall2025/docs/features/push-notification-system.md).

## Faculty RA interview calendar

Faculty can view and manage scheduled RA interviews from the new **RA Interview Calendar** page.

1. Log in as a faculty user and open **My Posted RAJobs**.
2. Click **RA Interview Calendar**.
3. Review scheduled and rescheduled interviews for RA jobs posted by the logged-in faculty user.
4. To reschedule, enter a new interview date/time, add an optional note, and submit **Reschedule**.
5. To cancel, add an optional reason and submit **Cancel**.

Rescheduling updates the RA job application interview time and marks it `rescheduled`. Canceling marks the RA job application `canceled`. The backend attempts to notify the student using the existing email helper.

## Contribution Guidelines
For contributors, please follow these guidelines when making changes to the code:

- Create a new branch named after yourself.
- Make modifications in your own branch.
- Submit your changes via a pull request for review and merging.

By following this process, we ensure that all code changes are tracked and reviewed properly before being merged into the main project.
