package service;
import java.util.HashMap;
import java.util.Map;
public class AuthenticationService {
    private static Map<String, String> users = new HashMap<>();
    static {
        // Initialize users (username, password)
        users.put("user1", "Password@123");
        users.put("user2", "StrongPass1!");
        users.put("user3", "Secure123@");
    }
    public static boolean login(String username, String password) {
        // Check if username exists and password matches criteria
        return users.containsKey(username) && validatePassword(password);
    }
    private static boolean validatePassword(String password) {
        // Password must contain at least one capital letter, one lowercase letter, one number, and one special character
        return password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$");
    }
}
