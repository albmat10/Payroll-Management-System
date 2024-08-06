import java.util.Scanner;

public class PayrollDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter employee's name: ");
            String name = scanner.nextLine();
            System.out.print("Enter employee's ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            Payroll payroll = new Payroll(name, id);

            System.out.print("Enter hours worked: ");
            double hours = Double.parseDouble(scanner.nextLine());
            payroll.setHoursWorked(hours);

            System.out.print("Enter hourly pay rate: ");
            double rate = Double.parseDouble(scanner.nextLine());
            payroll.setHourlyPayRate(rate);

            System.out.println("Gross pay: $" + payroll.calculateGrossPay());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
