package chapter8;

/*********************************************************************************
 * (Column sorting) Implement the following method to sort the columns in a       *
 * two-dimensional array. A new array is returned and the original array is intact.*
 *                                                                                *
 * public static double[][] sortColumns(double[][] m)                             *
 *                                                                                *
 * Write a test program that prompts the user to enter a 3 * 3 matrix of double   *
 * values and displays a new column-sorted matrix. Here is a sample run:          *
 *********************************************************************************/

import java.util.Scanner;

public class Exercise_08_27 {
    public static void main(String[] args) {
        // Get a 3 x 3 matrix of double values from user input
        double[][] matrix = getMatrix();

        // Get a new sorted matrix
        double[][] sortedMatrix = sortColumns(matrix);

        // Display new sorted matrix
        System.out.println("\nThe column-sorted array is");
        for (int i = 0; i < sortedMatrix.length; i++) {
            for (int j = 0; j < sortedMatrix.length; j++) {
                System.out.print(sortedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * getMatrix prompts the user to enter a 3 x 3
     * matrix of double values then returns it
     */
    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        double[][] m = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        return m;
    }

    /**
     * sortColumns return a new column-sorted
     * array leaving original array intact
     */
    public static double[][] sortColumns(double[][] m) {
        // Create a new 3-by-3 matrix
        double[][] s = new double[m.length][m[0].length];

        // Copy elements to new matrix
        copyMatrix(m, s);

        // Sort new matrix by column
        for (int col = 0; col < s.length; col++) {
            for (int row = 0; row < s.length - 1; row++) {
                double min = s[row][col];
                int index = row;
                for (int j = row + 1; j < s.length; j++) {
                    if (min > s[j][col]) {
                        min = s[j][col];
                        index = j;
                    }
                }
                if (index != row) {
                    s[index][col] = s[row][col];
                    s[row][col] = min;
                }
            }
        }
        return s;
    }

    /**
     * copyMatrix copies all the elements in the original matrix to the copy
     */
    public static void copyMatrix(double[][] original, double[][] copy) {
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                copy[i][j] = original[i][j];
            }
        }
    }

}
