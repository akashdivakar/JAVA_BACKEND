import java.util.Scanner;

public class ElectricityBill {

    // Method to calculate bill using local variables
    static void calculateBill(int units) {
        // 'bill' is a local variable
        double bill = 0;

        // Rate calculation:
        // First 100 units  -> Rs. 2/unit
        // Next 100 units   -> Rs. 3/unit
        // Above 200 units  -> Rs. 5/unit
        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = (100 * 2) + (units - 100) * 3;
        } else {
            bill = (100 * 2) + (100 * 3) + (units - 200) * 5;
        }

        System.out.println("Units consumed: " + units);
        System.out.println("Total Electricity Bill: Rs. " + bill);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity units: ");
        int units = sc.nextInt(); // 'units' is a local variable

        // Calling the method
        calculateBill(units);

        sc.close();
    }
}
