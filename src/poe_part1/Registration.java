/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe_part1;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Registration {
      public static boolean register() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Welcome to registration ");

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password (must contain a special character, a number,an underscore and >=8 characters long): ");
        String password = scanner.nextLine();

        // Password validation
        boolean hasSpecialChar = false;
        boolean hasUnderscore = false;
        for (char c : password.toCharArray()) {
            if (c == '_' || c == '@' || c == '#' || c == '$' || c == '%' || c == '^' || c == '&' || c == '*') {
                hasSpecialChar = true;
            }else{
                System.out.println("Incorrect format.Please try again!");
                return false;
            }
            if (c == '_') {
                hasUnderscore = true;
            }else{
                System.out.println("Incorrect format.Please try again!");
                return false;
            }
        }

        // Check if all requirements are met
        if (hasSpecialChar && hasUnderscore) {
            System.out.println("Registration Successful!");
            // Save user details here if needed
            return true;
        } else {
            System.out.println("Password does not have correct format. Please try again.");
            return false;
        }
        //Save details onto database
        //Procced to login
    }
}
    

