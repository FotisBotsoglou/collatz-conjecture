

public class Collatz {
    public static final  int N = 123;


    public static void main(String[] args) {
        System.out.println("Number of steps until reaching 1: "+run(N));
    }

    /**
     * The Collatz class implements the Collatz conjecture for a given initial value.
     * The Collatz conjecture involves repeatedly applying the following rules to a positive integer:
     * - If the integer is even, divide it by 2.
     * - If the integer is odd, multiply it by 3 and add 1.
     * The process continues until the integer becomes 1.
     * This class provides a method to run the Collatz conjecture and count the steps taken.
     */
    public static int run(int n){

        // Initialize a variable countSteps to keep track of the number of steps.
        int countSteps = 0;

        // Use a while loop that continues until n becomes 1.
        while (n!=1) {

            // If n is even, divide it by 2.
                if (n % 2 == 0) {
                    n = n / 2;
                    System.out.println(n);

                    // Increment countSteps.
                    countSteps++;

            // If n is odd, multiply it by 3 and add 1.
                } else {
                    n = 3 * n + 1;
                    System.out.println(n);

                    // Increment countSteps.
                    countSteps++;
                }

        }
        return countSteps;

    }
}
