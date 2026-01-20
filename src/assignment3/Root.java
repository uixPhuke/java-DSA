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

        d = b * b - 4 * a * c;

        if (d < 0) {
            System.out.println("Roots is imaginary");
        }

        if (d > 0) {
            System.out.println("Roots are equal so only one root.");
        }

        if (d == 0) {
            System.out.println("Roots are equal so only one Root.");
            System.out.println("Rational but not squared.");
        }
    }
}
