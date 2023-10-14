import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isStrong = false;

        while (!isStrong) {
            System.out.print("Please enter a password: ");
            String password = scanner.nextLine();
            String feedback = checkPasswordStrength(password);

            if (feedback.equals("Strong")) {
                System.out.println("Password strength: Strong");
                System.out.println("Password is strong. You may proceed.");
                isStrong = true;
            } else {
                System.out.println("Password strength: " + feedback);
            }
        }

        scanner.close();
    }

    public static String checkPasswordStrength(String password) {
        if (password.length() < 8 ||
                !password.matches(".*[A-Z].*") ||
                !password.matches(".*[a-z].*") ||
                !password.matches(".*\\d.*")) {
            return "Weak";
        } else if (!password.matches(".*[@#$%].*")) {
            return "Moderate";
        } else {
            return "Strong";
        }
    }
}
