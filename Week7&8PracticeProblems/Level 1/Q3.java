import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangle (meters): ");
        double s1 = sc.nextDouble();
        System.out.print("Enter side 2 of the triangle (meters): ");
        double s2 = sc.nextDouble();
        System.out.print("Enter side 3 of the triangle (meters): ");
        double s3 = sc.nextDouble();

        double rounds = computeRounds(s1, s2, s3);

        System.out.printf("To complete a 5 km run, the athlete must complete %.2f rounds.%n", rounds);
    }

    public static double computeRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double totalDistance = 5000; // 5km in meters
        return totalDistance / perimeter;
    }
}