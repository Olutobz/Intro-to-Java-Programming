package chapter1;

/*
(Algebra: solve 2 * 2 linear equations) You can use Crammer’s rule to solve the following
2 * 2 system of linear equation:

		ax + by = e   x = 	ed - bf	  y = af - ec
		cx + dy = f       	ad - bc       ad - bc

Write a program that solves the following equation and displays the value for x and y:

					3.4x + 50.2y = 44.5
					2.1x + .55y = 5.9
*/

public class Exercise_13 {
    public static void main(String[] args) {
        System.out.println("3.4x + 50.2y = 44.5");
        System.out.println("2.1x +  .55y =  5.9");
        System.out.println(); // prints a blank line
        System.out.println("x = (44.5 * .55) - (50.2 * 5.9)");
        System.out.println("    ----------------------------");
        System.out.println("    (3.4  * .55) - (50.2 * 2.1)");
        System.out.println(); // prints a blank line
        System.out.println("x = " + (((44.5 * .55) - (50.2 * 5.9)) /
                ((3.4 * .55) - (50.2 * 2.1))));
        System.out.println(" ");
        System.out.println("y = (3.4 * 5.9) - (44.5 * 2.1)");
        System.out.println("    --------------------------");
        System.out.println("    (3.4 * .55) - (50.2 * 2.1)");
        System.out.println(); // prints a blank line
        System.out.println("y = " + (((3.4 * 5.9) - (44.5 * 2.1)) /
                ((3.4 * .55) - (50.2 * 2.1))));
    }
}
