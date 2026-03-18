import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to generate its table: ");
        int number = sc.nextInt();
        
        int[] table = new int[10];

        // Store results in the array
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }

        // Display results from the array
        System.out.println("\nMultiplication Table for " + number + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
        sc.close();
    }
}