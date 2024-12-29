import java.util.*;

public class Tasksheet120 {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 10};
        int[] cumulativeSums = new int[numbers.length];
        int totalSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = 1; j <= numbers[i]; j++) {
                sum += j; // Compute sum from 1 to numbers[i]
            }
            cumulativeSums[i] = sum; // Store the cumulative sum
            totalSum += sum;
        }

        System.out.println("Cumulative sums of the Array is " + Arrays.toString(cumulativeSums));
        System.out.println("Total sum of cumulative sums: " + totalSum);
    }
}
