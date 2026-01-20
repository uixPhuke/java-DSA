package assignment3;

import java.util.Scanner;

class Number {
    public static void main(String args[]) {
        int num;
        Scanner S = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        num = S.nextInt();

        if (num == 0) {
            System.out.println("Not an Even or Odd No.");
        }
        else if (num % 2 == 0) {
            System.out.println(num + " is a Even No.");
        }
        else {
            System.out.println(num + " is an Odd No.");
        }
    }
}
