package services;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PushNotificationServiceTest {

    private final PushNotificationService pushNotificationService = new PushNotificationService();

    @Test
    public void buildFacultyOfferSubjectUsesPositionTitle() {
        assertEquals(
                "No-reply: Your [AI Research Assistant] Application Has Been Approved",
                pushNotificationService.buildFacultyOfferSubject("AI Research Assistant")
        );
    }

    @Test
    public void buildFacultyOfferBodyIncludesInterviewSlotsWhenProvided() {
        String body = pushNotificationService.buildFacultyOfferBody(
                "AI Research Assistant",
                "2026-05-01T10:00",
                null,
                "2026-05-02T14:30"
        );

        assertTrue(body.contains("Your application for Position AI Research Assistant has been reviewed and approved"));
        assertTrue(body.contains("The professor proposed the following interview time slots:"));
        assertTrue(body.contains("1. 2026-05-01T10:00"));
        assertTrue(body.contains("2. 2026-05-02T14:30"));
        assertTrue(body.contains("reserved for you for five days"));
    }

    @Test
    public void buildFacultyOfferBodyOmitsInterviewSectionWhenSlotsAbsent() {
        String body = pushNotificationService.buildFacultyOfferBody(
                "AI Research Assistant",
                null,
                "",
                "   "
        );

        assertFalse(body.contains("The professor proposed the following interview time slots:"));
        assertTrue(body.contains("Thank you for your interest."));
    }
}
