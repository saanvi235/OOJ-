import java.util.Scanner;

class Employee {
    String name;
    int age;
    int empID;
    String panID;
    double salary; 

    Employee(String name, int age, int empID, String panID, double salary) {
        this.name = name;
        this.age = age;
        this.empID = empID;
        this.panID = panID;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empID);
        System.out.println("PAN ID: " + panID);
        System.out.println("Basic Salary: " + salary);
    }

    void displaySalaryDetails() {
        final int CCA = 250;
        final int PT = 100;

        double DA = 0.4 * salary;
        double HRA = 0.2 * salary;
        double pf = 0.1 * salary;
        double incomeTax = 0.1 * salary;

        double gross_income = salary + DA + HRA + CCA;
        double dedn = pf + PT + incomeTax;
        double net_income = gross_income - dedn;

        System.out.println("Gross Income: " + gross_income);
        System.out.println("Net Income: " + net_income);
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[2];

        for (int i = 0; i < emp.length; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Employee ID: ");
            int empID = sc.nextInt();
            sc.nextLine();  

            System.out.print("PAN ID: ");
            String panID = sc.nextLine();

            System.out.print("Basic Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            emp[i] = new Employee(name, age, empID, panID, salary);
        }

        System.out.println("\n Employee Details with Salary ");
        for (Employee e : emp) {
            e.displayDetails();
            e.displaySalaryDetails();
        }
    }
}