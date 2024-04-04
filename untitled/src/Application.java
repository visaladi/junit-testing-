import service.AdditionalFunctionalityService;
import service.AuthenticationService;
import service.FuntionaAddValues;

import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt for login
        System.out.println("Welcome to the Application");
        System.out.println("Please login to continue");
        boolean loggedIn = false;
        String username, password;
        do {
            System.out.print("Username: ");
            username = scanner.nextLine();
            System.out.print("Password: ");
            password = scanner.nextLine();
            loggedIn = AuthenticationService.login(username, password);
            if (!loggedIn) {
                System.out.println("Invalid username or password. Please try again.");
            }
        } while (!loggedIn);
        // Once logged in, demonstrate additional functionality
        System.out.println("Login successful!");
        System.out.println("Welcome, " + username + "!");
        // Example of additional functionality
        AdditionalFunctionalityService.displayFeatures();

        // Simulate adding values
        FunctionAddValues.addValue("value1");
        FunctionAddValues.addValue("value2");

        // Simulate listing values
        System.out.println("Values in the list: " + FunctionAddValues.listValues());

        // Simulate saving values
        FunctionAddValues.saveValues();
        // Close scanner
        scanner.close();
    }
}