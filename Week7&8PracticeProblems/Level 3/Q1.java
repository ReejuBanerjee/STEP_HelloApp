import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        // b. Create an int array named heights of size 11
        int[] heights = new int[11];
        Random rand = new Random();

        System.out.println("Generated Heights of 11 Players (in cms):");
        for (int i = 0; i < heights.length; i++) {
            // b. Get 3 digits random height in range 150 to 250
            // rand.nextInt(max - min + 1) + min
            heights[i] = rand.nextInt(101) + 150;
            System.out.print(heights[i] + " ");
        }
        System.out.println("\n");

        // g. Finally display the results
        int totalSum = findSum(heights);
        double meanHeight = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Total Sum of Heights: " + totalSum + " cms");
        System.out.printf("Mean Height: %.2f cms%n", meanHeight);
        System.out.println("Shortest Player Height: " + shortest + " cms");
        System.out.println("Tallest Player Height: " + tallest + " cms");
    }

    // c. Write the method to Find the sum of all the elements
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int h : arr) {
            sum += h;
        }
        return sum;
    }

    // d. Write the method to find the mean height
    public static double findMean(int[] arr) {
        // a. Formula: mean = sum of all elements / number of elements
        int sum = findSum(arr);
        return (double) sum / arr.length;
    }

    // e. Write the method to find the shortest height
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    // f. Write the method to find the tallest height
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }
}