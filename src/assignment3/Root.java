package assignment3;

import java.util.Scanner;

class Root {
    public static void main(String args[]) {
        int a, b, c, d;
        Scanner S = new Scanner(System.in);

        System.out.println("Enter a:");
        a = S.nextInt();

        System.out.println("Enter b:");
        b = S.nextInt();

        System.out.println("Enter c:");
        c = S.nextInt();

        if (a == 0) {
            System.out.println("Not a Quadratic Equation");

        }

        d = b * b - 4 * a * c;

        if (d < 0) {
            System.out.println("Root is imaginary");
        }
        else if (d == 0) {
            System.out.println("Roots are equal so only one root");
        }
        else {
            System.out.println("Rational and squared");
            System.out.println("Rational but not squared");
        }


    }
}
