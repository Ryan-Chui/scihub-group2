package utils;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public final class InterviewSlotUtils {

    private InterviewSlotUtils() {
    }

    public static String sanitizeOptionalText(String value) {
        if (value == null) {
            return null;
        }
        String trimmedValue = value.trim();
        return trimmedValue.isEmpty() ? null : trimmedValue;
    }

    public static boolean hasInterviewSlots(String interviewSlot1, String interviewSlot2, String interviewSlot3) {
        return sanitizeOptionalText(interviewSlot1) != null
                || sanitizeOptionalText(interviewSlot2) != null
                || sanitizeOptionalText(interviewSlot3) != null;
    }

    public static String buildInterviewSlotsMessage(String interviewSlot1, String interviewSlot2, String interviewSlot3) {
        List<String> proposedSlots = Arrays.asList(interviewSlot1, interviewSlot2, interviewSlot3).stream()
                .map(InterviewSlotUtils::sanitizeOptionalText)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        if (proposedSlots.isEmpty()) {
            return "";
        }

        StringBuilder slotMessage = new StringBuilder();
        slotMessage.append("The professor proposed the following interview time slots:\n");
        for (int i = 0; i < proposedSlots.size(); i++) {
            slotMessage.append(i + 1).append(". ").append(proposedSlots.get(i)).append('\n');
        }
        slotMessage.append('\n');
        return slotMessage.toString();
    }
}
