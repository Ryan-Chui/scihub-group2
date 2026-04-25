package utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class InterviewSlotUtilsTest {

    @Test
    public void sanitizeOptionalTextNormalizesNullAndBlankValues() {
        assertNull(InterviewSlotUtils.sanitizeOptionalText(null));
        assertNull(InterviewSlotUtils.sanitizeOptionalText(""));
        assertNull(InterviewSlotUtils.sanitizeOptionalText("   "));
        assertNull(InterviewSlotUtils.sanitizeOptionalText("\n\t  "));
        assertEquals("2026-05-01T10:00", InterviewSlotUtils.sanitizeOptionalText("  2026-05-01T10:00  "));
    }

    @Test
    public void hasInterviewSlotsDetectsAtLeastOneSanitizedSlot() {
        assertFalse(InterviewSlotUtils.hasInterviewSlots(null, "", "  "));
        assertTrue(InterviewSlotUtils.hasInterviewSlots(null, " 2026-05-03T09:15 ", null));
    }

    @Test
    public void buildInterviewSlotsMessageReturnsEmptyWhenNoSlotsProvided() {
        assertEquals("", InterviewSlotUtils.buildInterviewSlotsMessage(null, "", "   "));
    }

    @Test
    public void buildInterviewSlotsMessageIncludesOnlyProvidedSlotsInOrder() {
        String message = InterviewSlotUtils.buildInterviewSlotsMessage(" 2026-05-01T10:00 ", null, "2026-05-02T14:30");

        assertEquals(
                "The professor proposed the following interview time slots:\n" +
                        "1. 2026-05-01T10:00\n" +
                        "2. 2026-05-02T14:30\n\n"
                ,
                message
        );
    }

    @Test
    public void buildInterviewSlotsMessageStartsNumberingAtOneWhenOnlyMiddleSlotExists() {
        String message = InterviewSlotUtils.buildInterviewSlotsMessage(null, " 2026-05-03T09:15 ", null);

        assertEquals(
                "The professor proposed the following interview time slots:\n" +
                        "1. 2026-05-03T09:15\n\n"
                ,
                message
        );
    }

    @Test
    public void buildInterviewSlotsMessageIncludesAllThreeTrimmedSlots() {
        String message = InterviewSlotUtils.buildInterviewSlotsMessage(
                " 2026-05-01T10:00 ",
                " 2026-05-02T14:30 ",
                " 2026-05-03T09:15 "
        );

        assertEquals(
                "The professor proposed the following interview time slots:\n" +
                        "1. 2026-05-01T10:00\n" +
                        "2. 2026-05-02T14:30\n" +
                        "3. 2026-05-03T09:15\n\n"
                ,
                message
        );
    }
}
