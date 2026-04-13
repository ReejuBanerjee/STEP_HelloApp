import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number (n): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            int recursiveSum = findSumRecursive(n);
            int formulaSum = findSumFormula(n);

            System.out.println("Sum using Recursion: " + recursiveSum);
            System.out.println("Sum using Formula: " + formulaSum);

            if (recursiveSum == formulaSum) {
                System.out.println("Comparison Result: Both computations are correct and match.");
            } else {
                System.out.println("Comparison Result: The results do not match.");
            }
        }
    }

    // Recursive method
    public static int findSumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + findSumRecursive(n - 1);
    }

    // Formula based method: n*(n+1)/2
    public static int findSumFormula(int n) {
        return (n * (n + 1)) / 2;
    }
}