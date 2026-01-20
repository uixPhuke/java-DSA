package assignment3;


import java.util.Scanner;

class Triangle {
    public static void main(String args[]) {
        int a, b, c;
        Scanner S = new Scanner(System.in);

        System.out.println("Enter first side:");
        a = S.nextInt();

        System.out.println("Enter second side:");
        b = S.nextInt();

        System.out.println("Enter third side:");
        c = S.nextInt();

        // Triangle validity check
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Not a Triangle");
        }
        else if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        }
        else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }
    }
}
