package chapter1;

/* (Compute expressions) Write a program that displays the result of
           9.5 * 4.5 - 2.5 * 3
           ------------------
              45.5 - 3.5  */

public class Exercise_05 {
    public static void main(String[] args) {
        System.out.println("9.5 X 4.5 - 2.5 X 3");
        System.out.println("-------------------");
        System.out.println("     45.5 - 3.5");
        System.out.print("Answer is: ");
        System.out.println(((9.5 * 4.5) - (2.5 * 3)) / (45.5 - 3.5));
    }
}
