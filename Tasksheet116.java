import java.util.Scanner;

public class Tasksheet116 {
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        input = scanner.next();

        StringBuilder inputReverse = new StringBuilder(input);
        inputReverse.reverse();

        if (input.equals (inputReverse.toString())){
            System.out.println("The input string is a palindrome.");
        }
        else{
            System.out.println("The input string is not a palindrome.");
        }


    }
}