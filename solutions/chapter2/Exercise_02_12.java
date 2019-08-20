package chapter2;

/*
(Physics: finding runway length) Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula:
												v^2
									length = ---
												 2a
Write a program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s2), and displays the minimum runway
length.
*/

import java.util.Scanner;

public class Exercise_02_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   // Create new Scanner object

        // Prompt the user to enter airplane's take-off speed and the acceleration
        System.out.print("Enter speed and the acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        // Compute the minimum runway length needed
        // for an airplane to take off
        double length = Math.pow(speed, 2) / (2 * acceleration);

        // Display the result
        System.out.println("The minimum runway length needed for the airplane to take off is : " + length);

    }
}
