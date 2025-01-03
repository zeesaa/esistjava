import java.util.Scanner;
import static java.lang.Math.addExact;
import static java.lang.Math.subtractExact;
import static java.lang.Math.multiplyExact;
import static java.lang.Math.floorDiv;

public class MathOperations{

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int sum = add(a, b);
        int difference = subtract(a, b);
        int product = multiply(a, b);
        float quotient = divide(a, b);

        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        System.out.println("The difference of " + a + " and " + b + " is: " + difference);
        System.out.println("The product of " + a + " and " + b + " is: " + product);
        System.out.println("The quotient of " + a + " and " + b + " is: " + quotient);

        scanner.close();
    }
}
