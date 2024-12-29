package Workshop4;

import java.util.regex.Pattern;

public class NotificationService {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";

    public boolean sendEmail(String email, String message) {
        if (isValidEmail(email)) {
            System.out.println("Sending email to: " + email);
            System.out.println("Message: " + message);
            return true; 
        }
        return false;
    }

    private boolean isValidEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }

    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        System.out.println(service.sendEmail("test@example.com", "Hello!")); // true
        System.out.println(service.sendEmail("invalid-email", "Hello!")); // false
    }
}
