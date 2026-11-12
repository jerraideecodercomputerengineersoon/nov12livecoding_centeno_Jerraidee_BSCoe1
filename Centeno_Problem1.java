import java.util.Scanner;

public class Centeno_Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Negative numbers are not allowed.");
        } else {
            System.out.println(sumOfDigits(number));
        }

        input.close();
    }

    public static int sumOfDigits(int number) {
        // Base case: there are no digits left to add.
        if (number == 0) {
            return 0;
        }

        // Recursive case: add the last digit to the sum of the remaining digits.
        int lastDigit = number % 10;
        int remainingDigits = number / 10;
        return lastDigit + sumOfDigits(remainingDigits);
    }
}
