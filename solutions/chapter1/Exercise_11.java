package chapter1;

/* (Population projection) The U.S. Census Bureau projects population based on the
following assumptions:
-->One birth every 7 seconds
-->One death every 13 seconds
-->One new immigrant every 45 seconds
Write a program to display the population for each of the next five years. Assume the
current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
integers perform division, the result is an integer. The fractional part is truncated. For
example, 5 / 4 is 1 (not 1.25 ) and 10 / 4 is 2 (not 2.5 ). To get an accurate result with
the fractional part, one of the values involved in the division must be a number with a
decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5 */

public class Exercise_11 {
    public static void main(String[] args) {
        System.out.println("Population projection");
        System.out.println("Given Current population is: 312032486");
        System.out.println("One birth every 7 seconds.");
        System.out.println("One death every 13 seconds.");
        System.out.println("One new immigrant every 45 seconds.");
        System.out.println("-------------------------------------------------------");
        System.out.println("Calculating the Yearly Population projection formula: ");
        System.out.println("Current population + ((births per year)");
        System.out.println("                   - (deaths per year)");
        System.out.println("                   + (new immigrants per year))");
        System.out.println("                   * year.");
        System.out.println("Population for each of the next five years will be: ");
        System.out.print("Year 1 population projection: ");
        System.out.println(312032486 + (((31536000 / 7)
                - (31536000 / 13)
                + (31536000 / 45))));
        System.out.print("Year 2 population projection: ");
        System.out.println(312032486 + (((31536000 / 7)
                - (31536000 / 13)
                + (31536000 / 45)) * 2));
        System.out.print("Year 3 polutation projection: ");
        System.out.println(312032486 + (((31536000 / 7)
                - (31536000 / 13)
                + (31536000 / 45)) * 3));
        System.out.print("Year 4 population projection: ");
        System.out.println(312032486 + (((31536000 / 7)
                - (31536000 / 13)
                + (31536000 / 45)) * 4));
        System.out.print("Year 5 population projection: ");
        System.out.println(312032486 + (((31536000 / 7)
                - (31536000 / 13) + (31536000 / 45)) * 5));
    }
}
