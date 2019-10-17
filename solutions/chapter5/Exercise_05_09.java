package chapter5;
/*
(Find the two highest scores) Write a program that prompts the user to enter the
number of students and each student’s name and score, and finally displays the
student with the highest score and the student with the second-highest score.
*/

import java.util.Scanner;

public class Exercise_05_09 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int score,                    // Holds students' score
                highest = 0,            // Highest score
                secondHighest = 0;    // Second highest score
        String name,        // Holds students' name
                student1 = "",    // Highest scoring student name
                student2 = "";    // Second highest scoring student name

        // Prompt the user to enter each students' name and score
        System.out.println("Enter each students' name and score:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student: " + (i + 1) + "\n   Name: ");
            name = input.next();
            System.out.print("   Score: ");
            score = input.nextInt();

            if (i == 0) {
                // Make the first student the highest scoring student so far
                highest = score;
                student1 = name;
            } else if (i == 1 && score > highest) {
                // Second student entered scored higher than first student
                secondHighest = highest;
                highest = score;
                student2 = student1;
                student1 = name;
            } else if (i == 1) {
                // Second student entered scored lower than first student
                secondHighest = score;
                student2 = name;
            } else if (score > highest && score > secondHighest) {
                // Last student entered has the highest score
                secondHighest = highest;
                student2 = student1;
                highest = score;
                student1 = name;
            } else if (score > secondHighest) {
                // Last student entered has the second highest score
                student2 = name;
                secondHighest = score;
            }
        }

        // Display the student with the highest score
        // and the student with the second-highest score.
        System.out.println("Highest scoring student: " + student1 +
                "\nSecond Highest scoring student: " + student2);
    }
}
