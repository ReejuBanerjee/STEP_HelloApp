import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] oldSalaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalaries = new double[10];
        double[] bonuses = new double[10];
        
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        // Input loop with validation
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            System.out.print("Enter Years of Service: ");
            double years = sc.nextDouble();

            if (salary < 0 || years < 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--; // Decrement index to repeat this employee
            } else {
                oldSalaries[i] = salary;
                yearsOfService[i] = years;
            }
        }

        // Calculation loop
        for (int i = 0; i < 10; i++) {
            double bonusPercent = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = oldSalaries[i] * bonusPercent;
            newSalaries[i] = oldSalaries[i] + bonuses[i];
            
            totalOldSalary += oldSalaries[i];
            totalNewSalary += newSalaries[i];
            totalBonus += bonuses[i];
        }

        // Final output
        System.out.println("\n--- Company Payout Summary ---");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Paid: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        
        sc.close();
    }
}