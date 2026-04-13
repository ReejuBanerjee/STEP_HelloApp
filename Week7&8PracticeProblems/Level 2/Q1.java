import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        
        System.out.println("\nSum of factors: " + findSum(factors));
        System.out.println("Product of factors: " + findProduct(factors));
        System.out.println("Sum of squares of factors: " + findSumOfSquares(factors));
    }

    // Method to find factors and return as an array
    public static int[] findFactors(int n) {
        int count = 0;
        // First loop to find the count
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        int[] factorsArr = new int[count];
        int index = 0;
        // Second loop to save factors into the array
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factorsArr[index++] = i;
        }
        return factorsArr;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    public static long findProduct(int[] arr) {
        long prod = 1;
        for (int x : arr) prod *= x;
        return prod;
    }

    public static double findSumOfSquares(int[] arr) {
        double sumSq = 0;
        for (int x : arr) {
            sumSq += Math.pow(x, 2);
        }
        return sumSq;
    }
}