import java.util.Scanner;

/**
 * This program computes the GCD for two numbers entered by the user
 * using the Euclidean Algorithm recursively.
 */
public class GCDCalc {
    
    private static Scanner scanner = new Scanner(System.in);

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nEnter two numbers to find their gcd (-1 to quit): ");
            
            System.out.print("Number 1: ");
            int n1 = scanner.nextInt();
            if (n1 == -1) break;
            
            System.out.print("Number 2: ");
            int n2 = scanner.nextInt();
            if (n2 == -1) break;
            
            System.out.println("(" + n1 + ", " + n2 + ") = " + gcd(n1, n2));
        }
        System.out.println("Goodbye.");
    }
}
