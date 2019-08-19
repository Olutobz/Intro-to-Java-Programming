package chapter1;

/* (Approximate pie) pie can be computed using the following formula:
            pie = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
   Write a program that displays the result of 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
   and 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 +...), Use 1.0 instead of 1 in your program
*/

public class Exercise_07 {
    public static void main(String[] args) {
        System.out.println(4 * (1.0 - (1 / 3) + (1 / 5) -
                (1 / 7) + (1 / 9) - (1 / 11)));
    }
}
