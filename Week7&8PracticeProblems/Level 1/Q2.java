import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        int handshakes = calculateHandshakes(numberOfStudents);

        System.out.println("The maximum number of possible handshakes is: " + handshakes);
    }

    public static int calculateHandshakes(int n) {
        // Combination formula: (n * (n - 1)) / 2
        return (n * (n - 1)) / 2;
    }
}