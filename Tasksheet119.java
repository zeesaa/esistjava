import java.util.Scanner;

public class Tasksheet119 {

    public static int addition(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public static int subtraction(int numOne, int numTwo) {
        return numOne - numTwo;
    }

    public static int multiplication(int numOne, int numTwo) {
        return numOne * numTwo;
    }

    public static int division(int numOne, int numTwo) {
        return numOne / numTwo;
    }

    public static void main(String[] args) {
        int numOne, numTwo;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        numOne =  scanner.nextInt();
        System.out.print("Enter second number: ");
        numTwo =  scanner.nextInt();

        int sum = addition(numOne, numTwo);
        int difference = subtraction(numOne, numTwo);
        int product = multiplication(numOne, numTwo);
        int quotient = division(numOne, numTwo);

        System.out.println("The sum of " + numOne + " and " + numTwo + " is " + sum);
        System.out.println("The difference of " + numOne + " and " + numTwo + " is " + difference);
        System.out.println("The product of " + numOne + " and " + numTwo + " is " + product);
        System.out.println("The quotient of " + numOne + " and " + numTwo + " is " + quotient);

        scanner.close();
    }
}
