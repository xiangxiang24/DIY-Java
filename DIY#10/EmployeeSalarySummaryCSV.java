import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmployeeSalarySummaryCSV {
    public static void main(String[] args) throws Exception {
        String fileName = "Employees.csv";
        File file = new File(fileName);
        Scanner input = new Scanner(file);
        double sum = 0;
        int max = Integer.MIN_VALUE;
        String ntop = "";
        
        System.out.printf("%-6s %-10s %8s %10s %12s%n", "ID", "Name", "Hours", "Rate($)", "Salary($)");
        while(input.hasNextLine()) {
            String line = input.nextLine();
            
            String[] part = line.split(",");
            int id = Integer.parseInt(part[0]);
            String name = part[1];
            double hr = Double.parseDouble(part[2]);
            double rate = Double.parseDouble(part[3]);
            double salary; //Calculated
            
            //Computing salary
            if (hr > 40) {
                double normal = 40 * rate;
                double extra = (hr - 40) * rate * 1.5;
                salary = normal + extra;
            } else {
                salary = hr * rate;
            }
            sum += salary;
            
            //Find top worker

            if (hr > max) {
                max = (int)hr;
                ntop = name;
            }
            
            System.out.printf("%-6s %-10s %8.2f %10.2f %12.2f%n", id, name, hr, rate, salary);
        }
        
        System.out.println();
        System.out.printf("Total Payroll: $" + "%.2f%n", sum);
        System.out.println("Top Worker: " + ntop + " (" + max + " hours)");
    }
}