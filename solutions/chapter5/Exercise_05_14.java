package chapter5;
/*
(Compute the greatest common divisor) Another solution for Listing 5.9 to find
the greatest common divisor of two integers n1 and n2 is as follows: First find d
to be the minimum of n1 and n2, then check whether d, d-1, d-2, . . . , 2, or 1 is
a divisor for both n1 and n2 in this order. The first such common divisor is the
greatest common divisor for n1 and n2. Write a program that prompts the user to
enter two positive integers and displays the gcd.
*/

import java.util.Scanner;

public class Exercise_05_14 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        // Make gcd to be the minimum of n1 and n2
        int gcd = Math.min(n1, n2);

        // Find the greatest common divisor
        while (n1 % gcd != 0 || n2 % gcd != 0) {
            gcd--;
        }

        // Display result
        System.out.println("The greatest common divisor for " + n1 +
                " and " + n2 + " is " + gcd);
    }
}
