package chapter1;

/* (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
seconds. Write a program that displays the average speed in miles per hour. (Note
that 1 mile is 1.6 kilometers.) */

public class Exercise_10 {
    public static void main(String[] args) {
        System.out.println("1 mile is 1.6 kilometers and 1hr is 60 minutes");
        System.out.println("Runner given distance in kilometers is: " + 14 + "km");
        System.out.println("Runner covered distance in miles will be: " + 14 / 1.6 + "mi");
        System.out.println("Average speed is (total distance in miles) / (time taken in hr(s)) : "
                + (14 / 1.6) / (45.5 / 60) + " miles/hr" );

    }
}
