import java.util.Scanner;

/**
 * This program recursively computes the fibonacci number entered by the user.
 *  
 * For example, if the user enters "5", the 5th fibonacci number will be returned 
 * (and printed).
 * 
 * For efficiency, an array is utilized to hold fibonacci numbers that have already been calculated.
 */
public class Fibonacci {
    
    private static Scanner scanner = new Scanner(System.in);
    
    /**
     * Performs setup for calculating the fibonacci number x. 
     * Sets up the alreadyCalculated array so that when x starts getting larger, each
     * lower fibonacci number isn't calculated multiple times (which would slow
     * this method down a LOT).
     * 
     * @param x Which fibonacci number to calculate
     */
    public static int fibonacci(int x) {
        int[] alreadyCalculated = new int[x + 1];
        
        initializeArray(alreadyCalculated);
        alreadyCalculated[0] = 0;
        if (alreadyCalculated.length > 1) {
            alreadyCalculated[1] = 1;
        }
        
        return calculateFibonacci(alreadyCalculated, x);
    }
    
    /**
     * The actual recursive method which calculates the fibonacci number x.
     */
    public static int calculateFibonacci(int[] alreadyCalculated, int x) {
        if (alreadyCalculated[x] != -1) return alreadyCalculated[x];
        
        alreadyCalculated[x] = calculateFibonacci(alreadyCalculated, x - 2) + calculateFibonacci(alreadyCalculated, x - 1);
        
        return alreadyCalculated[x];
    }
    
    /**
     * Sets all values of alreadyCalculated array to -1, to indicate they haven't
     * been calculated yet and the calculateFibonacci() should proceed with the calculation.
     */
    private static void initializeArray(int[] alreadyCalculated) {
        for (int i = 0; i < alreadyCalculated.length; i++) {
            alreadyCalculated[i] = -1;
        }
    }
    
    public static void main(String[] args) {
        while (true) {
            System.out.print("\nEnter which fibonacci number you wish to find (-1 to quit): ");
            int userNumber = scanner.nextInt();
            if (userNumber == -1) break;
            System.out.println("That fibonacci number is: " + fibonacci(userNumber));
        }
        System.out.println("Goodbye.");
    }
}
