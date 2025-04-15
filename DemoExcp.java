import java.util.Scanner;

// Custom exception for username error
class UsernameException extends Exception {
    public UsernameException(String msg) {
        super(msg);
    }
}

// Custom exception for password error
class PasswordException extends Exception {
    public PasswordException(String msg) {
        super(msg);
    }
}

public class DemoExcp {
    public static void main(String[] args) {
        String name = "nidhi";
        String pass = "nidhips";
        Scanner s = new Scanner(System.in);

        try {
            System.out.print("Enter username: ");
            String user = s.nextLine();

            System.out.print("Enter password: ");
            String pwd = s.nextLine();

            // Checking username and password validity
            if (!user.equals(name)) {
                throw new UsernameException("Username incorrect");
            } else if (!pwd.equals(pass)) {
                throw new PasswordException("Password incorrect");
            } else {
                System.out.println("Login Successful!!!");
            }
        } catch (UsernameException u) {
            System.out.println("Login failed:");
            u.printStackTrace();
        } catch (PasswordException p) {
            System.out.println("Login failed:");
            p.printStackTrace();
        } finally {
            s.close(); // Close the scanner resource
        }
    }
}

