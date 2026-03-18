import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        for (int n : nums) {
            if (n > 0) {
                String parity = (n % 2 == 0) ? "even" : "odd";
                System.out.println(n + " is positive and " + parity);
            } else if (n < 0) {
                System.out.println(n + " is negative");
            } else {
                System.out.println(n + " is zero");
            }
        }

        // Compare first and last elements
        int first = nums[0];
        int last = nums[nums.length - 1];
        
        System.out.print("\nComparison (First vs Last): ");
        if (first == last) {
            System.out.println("They are equal.");
        } else if (first > last) {
            System.out.println("First element is greater than last.");
        } else {
            System.out.println("First element is less than last.");
        }
        sc.close();
    }
}