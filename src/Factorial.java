
/**
 * This program can be used to find the factorial of a number.
 * The implementation of Factorial.calculate uses a recursive approach.
 * 
 * The point of this program is to practice thinking recursively.
 */
public class Factorial {
    
    public static long factorial(int x) {
        if (x == 1 || x == 0) return 1;
        return x * factorial(x - 1);
    }
    
    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(10));
    }
}
