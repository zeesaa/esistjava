
import java.util.Scanner;

public class Tasksheet117 {
    public static void main(String[] args) {
        int numOne, numTwo, numThree;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        numOne =  scanner.nextInt();
        System.out.print("Enter second number: ");
        numTwo =  scanner.nextInt();
        System.out.print("Enter third number: ");
        numThree =  scanner.nextInt();

        if (numOne >= numTwo && numOne >= numThree) {
            if (numOne == numTwo && numOne == numThree) {
                System.out.println("All numbers are equal");
            } else if (numOne == numThree) {
                System.out.println(numOne);
            } else {
                System.out.println(numOne);
            }
        } else if (numTwo >= numOne && numTwo >= numThree) {
            if (numTwo == numOne && numTwo == numThree) {
                System.out.println("All numbers are equal");
            } else if (numTwo == numOne) {
                System.out.println(numTwo);
            } else if (numTwo == numThree) {
                System.out.println(numTwo);
            } else {
                System.out.println(numTwo);
            }
        } else if (numThree >= numOne && numThree >= numTwo) {
            if (numThree == numOne && numThree == numTwo) {
                System.out.println("All numbers are equal");
            } else if (numThree == numOne) {
                System.out.println(numThree);
            } else if (numThree == numTwo) {
                System.out.println(numThree);
            } else {
                System.out.println(numThree);
            }
        } else {
            System.out.println("Tasksheet 117");
        }
    }
}