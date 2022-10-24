public class HumanReadableTime {
    public static String makeReadable(final int seconds) throws IllegalArgumentException{
        if (seconds < 0) throw new IllegalArgumentException("Count of seconds must be greateer or equal than 0");
        return String.format("%02d:%02d:%02d", (seconds / 3600) % 100, (seconds / 60) % 60, seconds % 60);
    }
}