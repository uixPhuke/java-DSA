package assignment3;

import java.util.Scanner;

class Employee {
    public static void main(String args[]) {
        double bSalary, GS, HRA, DA;
        Scanner S = new Scanner(System.in);

        System.out.println("Enter Your Basic Salary: ");
        bSalary = S.nextDouble();

        if (bSalary < 12000) {
            HRA = bSalary * 20 / 100;
            DA  = bSalary * 115 / 100;
        }
        else {
            HRA = bSalary * 15 / 100;
            DA  = bSalary * 90 / 100;
        }
        GS  = bSalary + HRA + DA;
        System.out.println("Gross Salary = " + GS);
    }
}
