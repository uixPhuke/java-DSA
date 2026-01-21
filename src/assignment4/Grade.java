package assignment4;

import java.util.Scanner;

class Grade {
    public static void main(String args[]) {

        int rollNo;
        String name;
        double s1, s2, s3, s4, s5;

        Scanner S = new Scanner(System.in);

        System.out.print("Enter Your Roll No.: ");
        rollNo = S.nextInt();

        System.out.print("Enter Your Name: ");
        name = S.next();

        System.out.print("Enter COA Mark: ");
        s1 = S.nextDouble();

        System.out.print("Enter PDS Mark: ");
        s2 = S.nextDouble();

        System.out.print("Enter DBMS Mark: ");
        s3 = S.nextDouble();

        System.out.print("Enter DM Mark: ");
        s4 = S.nextDouble();

        System.out.print("Enter OS Mark: ");
        s5 = S.nextDouble();

        double total = s1 + s2 + s3 + s4 + s5;
        double percentage = total / 5;

        System.out.println("\n--------- MARKSHEET ---------");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks Obtained: " + total);
        System.out.println("Percentage: " + percentage);

        int grade = (int) percentage / 10;

        switch (grade) {
            case 9:
                System.out.println("Grade O");
                break;
            case 8:
                System.out.println("Grade E");
                break;
            case 7:
                System.out.println("Grade A");
                break;
            case 6:
                System.out.println("Grade B");
                break;
            case 5:
                System.out.println("Grade C");
                break;
            case 4:
                System.out.println("Grade D");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
