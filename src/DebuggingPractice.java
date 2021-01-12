/**
 * Author: Mohammad Abdelrahman
 * CSC 211 Fall 2020
 * Directions: The code below is broken. I have placed the expected output in the comments.
 * Using the debugger tool and everything you've learned about loops, go through and 
 * debug this faulty code so it prints as expected.
 */
import java.util.*;

public class DebuggingPractice {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        /**
         Expected output:

         How many layers in your pyramid do you want?
         4

         *
         * *
         * * *
         * * * *
         */
        System.out.println("How many layers in your pyramid do you want?");
        int levels = sc.nextInt();

        System.out.println();

        for (int i = 1; i <= levels; i++) { // loop for the pyramid levels and skip a line
            for (int j = 0; j < i; j++) { // loop for stars in each level
                System.out.print("* "); // prints a star in each level of pyramid
            }

            System.out.println(); // prints new line for new level in pyramid
        }

        /**
         Expected output:

         What is your name?
         Turk

         K R U T
         */
        System.out.println("What is your name?");
        sc.nextLine();      // clearing the \n from the buffer
        String str = sc.nextLine().toUpperCase(); // store the user's input in a string as upper case
        String str2 = ""; //  string variable to reverse the order of user's string

        System.out.println(); // prints new line
        /*
        * loop starts from last letter in user's input to first letter
        * and placing each letter in str2 string
        * */
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i) + " "; // store the ith letter from str to str2
        }

        System.out.println(str2); // prints out the reversed user's input and capitalized

        sc.close(); // closes the stream!
    }
}