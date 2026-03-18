import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take the input for a number
        System.out.print("Enter a number: ");
        long inputNumber = sc.nextLong();
        
        // Handle negative numbers by converting to absolute
        long temp = Math.abs(inputNumber);
        String numStr = Long.toString(temp);

        // b. Find the count of digits in the number
        int digitCount = numStr.length();

        // c. Find the digits in the number and save them in an array
        int[] digitsArray = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            digitsArray[i] = Character.getNumericValue(numStr.charAt(i));
        }

        // d. Find the frequency of each digit. 
        // Frequency array of size 10 (indices 0-9)
        int[] frequencyArray = new int[10];

        // Loop through the digits array and increase frequency
        for (int digit : digitsArray) {
            frequencyArray[digit]++;
        }

        // e. Display the frequency of each digit in the number
        System.out.println("\nDigit Frequency for " + inputNumber + ":");
        for (int i = 0; i < 10; i++) {
            if (frequencyArray[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequencyArray[i] + " time(s).");
            }
        }

        sc.close();
    }
}