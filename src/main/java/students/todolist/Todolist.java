/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package students.todolist;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 *
 * @author Nathan
 */
public class Todolist {
     
    

    public String Name, Pass, first, last = "";

    public Todolist() {}

    public boolean checkUserName(String userName) {
        Pattern underScore = Pattern.compile("[_]");
        if (underScore.matcher(userName).find() && userName.length() == 5) {
            System.out.println("Username is correctly formatted");
            Name = userName;
            return true;
        } else {
            System.out.println("Username is not correctly formatted. Please ensure that your username contains an underscore and is no more than 5 characters in length");
            return false;
        }
    }

    public boolean passwordComplexity(String password) {
        Pattern number = Pattern.compile("[0-9]");
        Pattern upperLetter = Pattern.compile("[A-Z]");
        Pattern lowerLetter = Pattern.compile("[a-z]");
        Pattern character = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);

        if (password.length() > 8 && character.matcher(password).find() && upperLetter.matcher(password).find() &&
                lowerLetter.matcher(password).find() && number.matcher(password).find()) {
            Pass = password;
            System.out.println("Password Successfully captured");
            System.out.println("Password meets complexity requirements");
            return true;
        } else {
            System.out.println("Password is not correctly formatted. Please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character");
            return false;
        }
    }

    public void RegisterUser(Scanner scanner) {
        Todolist getMethod = new Todolist(); // Initialize the getMethod object
        String userName;

        while (true) {
            try {
                System.out.println("Please enter your username:");
                userName = scanner.nextLine();
                if (getMethod.checkUserName(userName)) {
                    System.out.println("Please enter your password:");
                    String password = scanner.nextLine();
                    if (getMethod.passwordComplexity(password)) {
                        System.out.println("Registration successful!");
                        // If needed, you can add further functionality here
                        break;
                    }
                }
            } catch (Exception e) {
                break;
            }
        }
    }

    public boolean LOGINUser(String logUser, String logPassword) {
        // Implement the login functionality here
        String correctUsername = "user";
        String correctPassword = "password";

        if (logUser.equals(correctUsername) && logPassword.equals(correctPassword)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Incorrect username or password. Please try again.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Todolist todolist = new Todolist();
        todolist.RegisterUser(scanner);

        System.out.println("Welcome");
        System.out.println("Please enter your username for login:");
        String username = scanner.nextLine();
        System.out.println("Please enter your password for login:");
        String password = scanner.nextLine();
        todolist.LOGINUser(username, password);
        scanner.close();
    }
}
    
  
   
    
    
    

    

