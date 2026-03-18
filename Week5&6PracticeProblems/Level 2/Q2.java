import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height for " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        // Finding youngest and tallest
        int minAgeIdx = 0;
        int maxHeighIdx = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAgeIdx]) {
                minAgeIdx = i;
            }
            if (heights[i] > heights[maxHeighIdx]) {
                maxHeighIdx = i;
            }
        }

        // Display results
        System.out.println("\n--- Friend Comparison Results ---");
        System.out.println("The youngest friend is " + names[minAgeIdx] + " (Age: " + ages[minAgeIdx] + ")");
        System.out.println("The tallest friend is " + names[maxHeighIdx] + " (Height: " + heights[maxHeighIdx] + ")");
        
        sc.close();
    }
}