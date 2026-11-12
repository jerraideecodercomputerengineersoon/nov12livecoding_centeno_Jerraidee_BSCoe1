import java.util.Scanner;

public class Centeno_Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the number of elements first, then read that many integers.
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("The array must contain at least one element.");
        } else {
            int[] values = new int[size];
            for (int index = 0; index < values.length; index++) {
                values[index] = input.nextInt();
            }

            System.out.println("Array Sum: " + arraySum(values, 0));
            System.out.println("Largest Element: " + findMaximum(values, 0));
            System.out.println("Number of Even Elements: " + countEven(values, 0));
        }

        input.close();
    }

    public static int arraySum(int[] values, int index) {
        // Base case: no elements remain to add.
        if (index == values.length) {
            return 0;
        }

        // Recursive case: add the current element to the sum of the rest.
        return values[index] + arraySum(values, index + 1);
    }

    public static int findMaximum(int[] values, int index) {
        // Base case: the last element is the maximum of the one-element remainder.
        if (index == values.length - 1) {
            return values[index];
        }

        // Recursive case: compare the current element with the maximum of the rest.
        int remainingMaximum = findMaximum(values, index + 1);
        if (values[index] > remainingMaximum) {
            return values[index];
        }
        return remainingMaximum;
    }

    public static int countEven(int[] values, int index) {
        // Base case: no elements remain to check.
        if (index == values.length) {
            return 0;
        }

        // Recursive case: count the current element if even, then count the rest.
        int currentCount = 0;
        if (values[index] % 2 == 0) {
            currentCount = 1;
        }
        return currentCount + countEven(values, index + 1);
    }
}
