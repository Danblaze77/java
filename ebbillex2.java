import java.util.Scanner;

class ElectricityBill {
    int conNo;
    String conName;
    double pMonReading;
    double curMonReading;
    String conType;

    public ElectricityBill(int conNo, String conName, double pMonReading, double curMonReading, String conType) {
        this.conNo = conNo;
        this.conName = conName;
        this.pMonReading = pMonReading;
        this.curMonReading = curMonReading;
        this.conType = conType;
    }

    public double calculateBillAmount() {
        double unitConsumed = curMonReading - pMonReading;
        double bill = 0;

        if (conType.equals("domestic")) {
            if (unitConsumed <= 100) {
                bill = unitConsumed * 2;
            } else if (unitConsumed <= 200) {
                bill = 100 * 2 + (unitConsumed - 100) * 3.5;
            } else if (unitConsumed <= 500) {
                bill = 100 * 2 + 100 * 3.5 + (unitConsumed - 200) * 5;
            } else {
                bill = 100 * 2 + 100 * 3.5 + 300 * 5 + (unitConsumed - 500) * 6;
            }
        } else if (conType.equals("commercial")) {
            if (unitConsumed <= 100) {
                bill = unitConsumed * 3;
            } else if (unitConsumed <= 200) {
                bill = 100 * 3 + (unitConsumed - 100) * 5.5;
            } else if (unitConsumed <= 500) {
                bill = 100 * 3 + 100 * 5.5 + (unitConsumed - 200) * 7;
            } else {
                bill = 100 * 3 + 100 * 5.5 + 300 * 7 + (unitConsumed - 500) * 8;
            }
        }

        return bill;
    }

    public void displayBill() {
        double bill = calculateBillAmount();
        System.out.println("Electricity Bill");
        System.out.println("Consumer No.: " + conNo);
        System.out.println("Consumer Name: " + conName);
        System.out.println("Previous Month Reading: " + pMonReading + " units");
        System.out.println("Current Month Reading: " + curMonReading + " units");
        System.out.println("Connection Type: " + conType);
        System.out.println("Bill Amount: Rs. " + bill);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Consumer No.: ");
        int conNo = scanner.nextInt();

        System.out.print("Enter Consumer Name: ");
        String conName = scanner.next();

        System.out.print("Enter Previous Month Reading: ");
        double pMonReading = scanner.nextDouble();

        System.out.print("Enter Current Month Reading: ");
        double curMonReading = scanner.nextDouble();

        System.out.print("Enter Connection Type (Domestic/Commercial): ");
        String conType = scanner.next();

        ElectricityBill bill = new ElectricityBill(conNo, conName, pMonReading, curMonReading, conType);
        bill.displayBill();

        scanner.close();
    }
}
