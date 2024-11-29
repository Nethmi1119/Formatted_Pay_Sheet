public class Pay_Sheet {
    public static void main(String[] args) {
        // Ensure the correct number of arguments are passed
        if (args.length != 4) {
            System.out.println("Usage: java EmployeePaySheet <employeeName> <employeeId> <hoursWorked> <hourlyRate>");
            return;
        }

        // Convert command-line arguments
        String employeeName = args[0];
        int employeeId = Integer.parseInt(args[1]);
        int hoursWorked = Integer.parseInt(args[2]);
        double hourlyRate = Double.parseDouble(args[3]);

        // Constants and calculations
        final double TAX_RATE = 0.10;
        double grossSalary = hourlyRate * hoursWorked;
        double taxDeduction = grossSalary * TAX_RATE;
        double netSalary = grossSalary - taxDeduction;

        // Display the formatted pay sheet
        System.out.println("-----------------------------------------");
        System.out.println("             Employee Pay Sheet          ");
        System.out.println("-----------------------------------------");
        System.out.printf("Employee Name: %-20s%n", employeeName);
        System.out.printf("Employee ID  : %-20d%n", employeeId);
        System.out.printf("Hourly Rate  : $%-19.2f%n", hourlyRate);
        System.out.printf("Hours Worked : %-20d%n", hoursWorked);
        System.out.printf("Gross Salary : $%-19.2f%n", grossSalary);
        System.out.printf("Tax Deduction: $%-19.2f%n", taxDeduction);
        System.out.println("-----------------------------------------");
        System.out.printf("Net Salary   : $%-19.2f%n", netSalary);
        System.out.println("-----------------------------------------");
    }
}


