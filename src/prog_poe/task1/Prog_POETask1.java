/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_poe.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

/**
 *
 * @author DISD3
 */
public class Prog_POETask1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String username, password, firstName, lastName;
        username = JOptionPane.showInputDialog("Enter a username");
        password = JOptionPane.showInputDialog("Enter a password");
        firstName = JOptionPane.showInputDialog("Enter your firstname");
        lastName = JOptionPane.showInputDialog("Enter your lastname");
        
    }

    public static boolean checkUsername(String username, String password, String firstName, String lastName) {
        username = JOptionPane.showInputDialog("Enter a username");

        if (username.contains("_") && username.length() <= 5) {
            System.out.println("congratulations" + firstName + " " + lastName + "your account was successfully created");
        } else if (username.contains("_") && username.length() > 5) {
            System.out.println("username is not correct formatted,please check that your username contains an underscore and is not more than 5 characters");
        }

        return false;
    }

    public static boolean checkPasswordComplexity(String password) {
        password = JOptionPane.showInputDialog("Enter a password");
        if (password.length() < 8) {
            return false;
        } else {
            for (int p = 0; p < password.length(); p++) {
                if (Character.isUpperCase(password.charAt(p)));
            }
            for (int r = 0; r < password.length(); r++) {
                Pattern pattern = Pattern.compile("a-zA-z0-9");
                Matcher matcher = pattern.matcher(password);
                boolean isStringContainsSpecialCharacter = matcher.find();
                if (isStringContainsSpecialCharacter) {
                    System.out.println("Your password meets the password complexity");
                } else {
                    System.out.println("Your password does not meet the requirements. Please make sure your password contains the following "
                            + "At least 8 characters."
                            + "At least 1 capital letter"
                            + "At least 1 number"
                            + "At least 1 special character");

                }
                for (int s = 0; s < password.length(); s++) {
                    if (Character.isDigit(password.charAt(s)));
                }
                return true;

            }
        }
        return false;
    }
 
    public static String registerUser(String username, String password, char p, char r, char s, boolean isStringContainsSpecialCharacter) {

        if (checkPasswordComplexity(password) == true && Character.isUpperCase(password.charAt(p))) {

        }
        return "Congratluations you have successfully created an account and you are now regisered";

    }

    public static boolean loginUser(String password, String username) {
        if ((password == null ? password != null : !password.equals(password)) && (username == null ? username != null : !username.equals(username))) {

        }
        return false;
    }

    public static String returnLoginStatus(String password, String username) {
        if (loginUser(password, username) == true) {
            return "you have successfully logged into your account";
        } else {
            return "raaah, your account does not seem to exist,please try again";
        }

    }

}
