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
public class Login {
     public static boolean login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n  Login ");

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        
         // Check password length and special characters
        if (password.length() < 8 || !containsSpecialAndUnderscore(password)) {
            System.out.println("Login Failed! Incorrect username or password.");
            return false;
        } else {
            System.out.println("Login Successful! Welcome, " + username + "!");
            return true;
        }
    }

    private static boolean containsSpecialAndUnderscore(String password) {
        boolean hasSpecialChar = false;
        boolean hasUnderscore = false;
        for (char c : password.toCharArray()) {
            if (c == '_' || c == '@' || c == '#' || c == '$' || c == '%' || c == '^' || c == '&' || c == '*') {
                hasSpecialChar = true;
            }
            if (c == '_') {
                hasUnderscore = true;
            }
        }
        return hasSpecialChar && hasUnderscore;
    }
        
        }
    

    

