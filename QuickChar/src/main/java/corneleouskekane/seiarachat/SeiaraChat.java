/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package corneleouskekane.seiarachat;

/**
 *
 * @author corneleous
 *
 */
  
  import java.util.Scanner;
  import java.util.regex.Pattern;

public class SeiaraChat {

    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);

        //entering the details for registering
        System.out.print("Please enter Username");
        String username = scanner.nextLine();

        System.out.print("please enter E-Mail");
        String email = scanner.nextLine();

      
       System.out.print("Enter cell phone number (example - +27 72 123 4567)");
        String cellPhoneNumber = scanner.nextLine();

        System.out.print("please enter password");
        String password = scanner.nextLine();
        
           //if the correct format has been applied we show registration succesful       
        if (isValidUsername(username) && isValidEmail(email) && isValidCellPhoneNumber(cellPhoneNumber) && isValidPassword(password)) {
            System.out.println("Your registration was succesful");
            
                  

        
        
    }
}
    public static boolean isValidUsername(String username) {
        if (username.length() > 5) {
            System.out.println("username must have less than 5 letters/characters");
            return false;
        }
        
               if (username.contains("_")) {
            System.out.println("username may not have an underscore");
            return false;
        }
        return true;
    }

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@ " +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$ ";
        if (!Pattern.matches(emailRegex, email)) {
            System.out.println("Invalid email address");
            return false;
        }
        return true;
    }
           public static boolean isValidCellPhoneNumber(String cellPhoneNumber) {
        String cellPhoneRegex = "^\\+27\\d{9}$";
        if (!Pattern.matches(cellPhoneRegex, cellPhoneNumber)) {
            System.out.println("Invalid cell phone number. Please use the format +27 followed by 9 digits.");
            return false;
        }
        return true;
    }
                 public static boolean isValidPassword(String password) {
        if (password.length() > 8) {
            System.out.println("Password must not be more than 8 characters");
            return false;
        }
           if (!Pattern.matches(".*[A-Z].*", password)) {
            System.out.println("Password must contain a capital letter");   //initially i made it private class but i couldnts use it in my main class so i changed it
            return false;
        }
        if (!Pattern.matches(".*\\d.*", password)) {
            System.out.println("Password must contain at least a number");
            return false;
        }
        if (!Pattern.matches(".*[^a-zA-Z0-9].*", password)) {
            System.out.println("Password must contain a special character");
            return false;
        }
        return true;
    }
                // LoginSeiaraChats =LoginSeiaraChats.getDetailsForLogin(scanner);
                 //LoginSeiaraChats.logingin();
}