import java.util.Scanner;

/**
 * This program can be used to find the factorial of a number entered by the user.
 * The implementation of Factorial.calculate uses a recursive approach.
 * 
 * The point of this program is to practice thinking recursively.
 */
public class Factorial {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static long factorial(int x) {
        if (x == 1 || x == 0) return 1;
        return x * factorial(x - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("Note: beware of overflow on numbers greater than 20!.");
        while (true) {
            System.out.print("\nEnter a number to find its factorial (-1 to quit): ");
            int userNumber = scanner.nextInt();
            if (userNumber == -1) break;
            System.out.println(userNumber + "! = " + factorial(userNumber));
        }
        System.out.println("Goodbye.");
    }
}
