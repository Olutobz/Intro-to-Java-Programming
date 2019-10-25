package chapter6;
/*
(Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
isPrime(int number) method for testing whether a number is prime. Use this
method to find the number of prime numbers less than 10000.
*/

public class Exercise_06_10 {
    public static void main(String[] args) {
        int numberOfPrimes = 0;	// Counts the number of prime numbers
        // Find the number of prime numbers less than 10000
        for (int i = 1; i < 1000; i++) {
            if (PrimeNumberMethod.isPrime(i))
                numberOfPrimes++; // Increment
        }

        // Display result
        System.out.println("The number of prime numbers less than 10000: " + numberOfPrimes);
    }
}

class PrimeNumberMethod {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness

        // Repeatedly find prime numbers
        while (count < numberOfPrimes) {
            // Print the prime number and increase the count
            if (isPrime(number)) {
                count++; // Increase the count

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    // Print the number and advance to the new line
                    System.out.printf("%-5s\n", number);
                }
                else
                    System.out.printf("%-5s", number);
            }

            // Check whether the next number is prime
            number++;
        }
    }

    /** Check whether number is prime */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number/2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime
            }
        }
        return true; // Number is prime
    }
}

