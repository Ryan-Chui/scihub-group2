package services;

import models.Mail;
import models.RAJobApplication;
import models.User;
import utils.InterviewSlotUtils;

import javax.inject.Singleton;

@Singleton
public class PushNotificationService {

    public String buildFacultyOfferSubject(String positionTitle) {
        return "No-reply: Your [" + positionTitle + "] Application Has Been Approved";
    }

    public String buildFacultyOfferBody(String positionTitle, String interviewSlot1, String interviewSlot2,
                                        String interviewSlot3) {
        return "Dear Applicant,\n\n"
                + "Your application for Position " + positionTitle
                + " has been reviewed and approved by the professor. Please reach out to the professor within five working days to discuss the details of the position.\n\n"
                + InterviewSlotUtils.buildInterviewSlotsMessage(interviewSlot1, interviewSlot2, interviewSlot3)
                + "This position will be reserved for you for five days. After that period, it will be made available to the public again.\n\n"
                + "Thank you for your interest. We look forward to your response.\n\n"
                + "Best Regards, \n\n"
                + "SMU-Lyle-Sci-Hub Group";
    }

    public boolean hasInterviewSlots(RAJobApplication application) {
        return InterviewSlotUtils.hasInterviewSlots(
                application.getInterviewSlot1(),
                application.getInterviewSlot2(),
                application.getInterviewSlot3()
        );
    }

    public Mail createFacultyInterviewSlotNotification(RAJobApplication application) {
        if (application == null || application.getAppliedRAJob() == null || application.getApplicant() == null) {
            return null;
        }
        Mail notification = new Mail();
        notification.setTitle(buildFacultyOfferSubject(application.getAppliedRAJob().getTitle()));
        notification.setContent(buildFacultyOfferBody(
                application.getAppliedRAJob().getTitle(),
                application.getInterviewSlot1(),
                application.getInterviewSlot2(),
                application.getInterviewSlot3()
        ));
        notification.setSender(application.getAppliedRAJob().getRajobPublisher());
        notification.setReceiver(application.getApplicant());
        notification.save();
        return notification;
    }

    public Mail createFacultyInterviewSlotNotificationIfAbsent(RAJobApplication application) {
        if (application == null || application.getAppliedRAJob() == null || application.getApplicant() == null
                || application.getAppliedRAJob().getRajobPublisher() == null) {
            return null;
        }

        String title = buildFacultyOfferSubject(application.getAppliedRAJob().getTitle());
        String content = buildFacultyOfferBody(
                application.getAppliedRAJob().getTitle(),
                application.getInterviewSlot1(),
                application.getInterviewSlot2(),
                application.getInterviewSlot3()
        );

        Mail existing = Mail.find.query()
                .where()
                .eq("sender.id", application.getAppliedRAJob().getRajobPublisher().getId())
                .eq("receiver.id", application.getApplicant().getId())
                .eq("title", title)
                .eq("content", content)
                .findOne();
        if (existing != null) {
            return existing;
        }

        Mail notification = new Mail();
        notification.setTitle(title);
        notification.setContent(content);
        notification.setSender(application.getAppliedRAJob().getRajobPublisher());
        notification.setReceiver(application.getApplicant());
        notification.save();
        return notification;
    }

    public User getNotificationRecipient(RAJobApplication application) {
        return application.getApplicant();
    }
}
