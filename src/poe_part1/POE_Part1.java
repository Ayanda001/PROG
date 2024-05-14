/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe_part1;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class POE_Part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner scanner = new Scanner(System.in);
        boolean registrationSuccess = false;
        boolean loginSuccess = false;

        
        
            registrationSuccess = Registration.register();
        

        
      
            loginSuccess = Login.login();
       
    }
}
    
    

