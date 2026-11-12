import java.util.Scanner;

public class Centeno_Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Accept either whitespace or a comma between the two integers.
        input.useDelimiter("[\\s,]+");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        if (firstNumber < 0 || secondNumber < 0) {
            System.out.println("Negative numbers are not allowed.");
        } else if (firstNumber == 0 && secondNumber == 0) {
            System.out.println("GCD is undefined.");
        } else {
            System.out.println(gcd(firstNumber, secondNumber));
        }

        input.close();
    }

    public static int gcd(int a, int b) {
        // Base case: a is the GCD when the second number reaches zero.
        if (b == 0) {
            return a;
        }

        // Recursive case: use the second number and the remainder.
        return gcd(b, a % b);
    }
}
