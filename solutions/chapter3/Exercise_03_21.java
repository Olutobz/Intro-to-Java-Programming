package chapter3;

/*
(Science: day of the week) Zeller’s congruence is an algorithm developed by
Christian Zeller to calculate the day of the week.

      h = ( q + (26(m + 1) / 10) + k + (k / 4) + (j / 4) + 5j ) % 7

■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:
Wednesday, 5: Thursday, 6: Friday).
■ q is the day of the month.
■ m is the month (3: March, 4: April, ..., 12: December). January and February
are counted as months 13 and 14 of the previous year.
■ j is the century (i.e., year / 100)
■ k is the year of the century (i.e., year % 100).

Note that the division in the formula performs an integer division. Write a pro-
gram that prompts the user to enter a year, month, and day of the month, and
displays the name of the day of the week.
*/

import java.util.Scanner;

public class Exercise_03_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year, month, and day of the month.
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int dayOfMonth = input.nextInt();

        // Convert January and February to months 13 and 14 of the previous year
        if (month == 1 || month == 2) {
            month = (month == 1) ? 13 : 14;
            year--;
        }

        // Calculate day of the week
        int dayOfWeek = (dayOfMonth + (26 * (month + 1)) / 10 + (year % 100)
                + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;

        // Display result
        System.out.print("Day of the week is ");
        switch (dayOfWeek) {
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
        }
    }
}
