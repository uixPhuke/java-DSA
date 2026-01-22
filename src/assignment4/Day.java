package assignment4;

import java.util.Scanner;

class Day {
    public static void main(String args[]) {

        int input;
        int num;

        Scanner S = new Scanner(System.in);

        System.out.print("Enter a Number (1–7): ");
        input = S.nextInt();

        System.out.print("Enter number of days to add: ");
        num = S.nextInt();
        System.out.println("Day is: ");
        switch (input) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Enter a Valid Day");
        }

        int output = (num + input) % 7;
        System.out.println("After "+num+ " Days "+ "Day Will Be :");

        switch (output) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 0: System.out.println("Sunday"); break;
        }
    }
}
