package assignment2;

import java.util.Scanner;

class Add {
    public static void main(String args[]) {
        int a, b, c;
        Scanner S = new Scanner(System.in);

        System.out.println("Enter the Value of a:");
        a = S.nextInt();

        System.out.println("Enter the Value of b:");
        b = S.nextInt();

        c = a + b;

        System.out.println("The sum of " + a + " and " + b + " is " + c);
    }
}

