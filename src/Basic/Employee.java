package Basic;

import java.util.Scanner;

class Employee {
    String name;
    int empNo;
    int workingDays;
    int workingHours;
    double salaryPerHour;
    double totalSalary;

    // Default constructor
    Employee() {
        name = "";
        empNo = 0;
        workingDays = 0;
        workingHours = 0;
        salaryPerHour = 0;
        totalSalary = 0;
    }

    // Parameterized constructor
    Employee(String name, int empNo, int workingDays, int workingHours) {
        this.name = name;
        this.empNo = empNo;

        if (workingDays <= 31)
            this.workingDays = workingDays;
        else
            this.workingDays = 31;

        if (workingHours <= 8)
            this.workingHours = workingHours;
        else
            this.workingHours = 8;
    }

    // Method to input employee details
    void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Employee Number: ");
        empNo = sc.nextInt();

        System.out.print("Enter Working Days (max 31): ");
        workingDays = sc.nextInt();
        if (workingDays > 31)
            workingDays = 31;

        System.out.print("Enter Working Hours per day (max 8): ");
        workingHours = sc.nextInt();
        if (workingHours > 8)
            workingHours = 8;
    }

    // Method to input salary and calculate total salary
    void calculateSalary() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary per Hour (max 500): ");
        salaryPerHour = sc.nextDouble();

        if (salaryPerHour > 500)
            salaryPerHour = 500;

        totalSalary = workingDays * workingHours * salaryPerHour;
    }

    // Method to display details
    void display() {
        System.out.println("\nEmployee Details");
        System.out.println("Name: " + name);
        System.out.println("Emp No: " + empNo);
        System.out.println("Working Days: " + workingDays);
        System.out.println("Working Hours per Day: " + workingHours);
        System.out.println("Salary per Hour: Rs " + salaryPerHour);
        System.out.println("Total Salary: Rs " + totalSalary);
    }
}

 class Main {
    public static void main(String[] args) {

        // Object using parameterized constructor
        Employee e1 = new Employee("Rahul", 101, 25, 8);
        e1.salaryPerHour = 400;
        e1.totalSalary = e1.workingDays * e1.workingHours * e1.salaryPerHour;

        // Object using default constructor
        Employee e2 = new Employee();
        e2.inputDetails();
        e2.calculateSalary();

        // Display both employees
        e1.display();
        e2.display();
    }
}