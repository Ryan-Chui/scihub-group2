package utils;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InterviewSlotUtilsTest {

    @Test
    public void sanitizeOptionalTextNormalizesNullAndBlankValues() {
        assertThat(InterviewSlotUtils.sanitizeOptionalText(null)).isNull();
        assertThat(InterviewSlotUtils.sanitizeOptionalText("")).isNull();
        assertThat(InterviewSlotUtils.sanitizeOptionalText("   ")).isNull();
        assertThat(InterviewSlotUtils.sanitizeOptionalText("\n\t  ")).isNull();
        assertThat(InterviewSlotUtils.sanitizeOptionalText("  2026-05-01T10:00  ")).isEqualTo("2026-05-01T10:00");
    }

    @Test
    public void buildInterviewSlotsMessageReturnsEmptyWhenNoSlotsProvided() {
        assertThat(InterviewSlotUtils.buildInterviewSlotsMessage(null, "", "   ")).isEmpty();
    }

    @Test
    public void buildInterviewSlotsMessageIncludesOnlyProvidedSlotsInOrder() {
        String message = InterviewSlotUtils.buildInterviewSlotsMessage(" 2026-05-01T10:00 ", null, "2026-05-02T14:30");

        assertThat(message).isEqualTo(
                "The professor proposed the following interview time slots:\n" +
                        "1. 2026-05-01T10:00\n" +
                        "2. 2026-05-02T14:30\n\n"
        );
    }

    @Test
    public void buildInterviewSlotsMessageStartsNumberingAtOneWhenOnlyMiddleSlotExists() {
        String message = InterviewSlotUtils.buildInterviewSlotsMessage(null, " 2026-05-03T09:15 ", null);

        assertThat(message).isEqualTo(
                "The professor proposed the following interview time slots:\n" +
                        "1. 2026-05-03T09:15\n\n"
        );
    }

    @Test
    public void buildInterviewSlotsMessageIncludesAllThreeTrimmedSlots() {
        String message = InterviewSlotUtils.buildInterviewSlotsMessage(
                " 2026-05-01T10:00 ",
                " 2026-05-02T14:30 ",
                " 2026-05-03T09:15 "
        );

        assertThat(message).isEqualTo(
                "The professor proposed the following interview time slots:\n" +
                        "1. 2026-05-01T10:00\n" +
                        "2. 2026-05-02T14:30\n" +
                        "3. 2026-05-03T09:15\n\n"
        );
    }
}
