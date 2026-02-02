package assignment5;

import java.util.Scanner;

class BitShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value (v): ");
        int v = sc.nextInt();

        System.out.print("Enter shifting value (n): ");
        int n = sc.nextInt();

        System.out.println("Left shift (v << n): " + (v << n));
        System.out.println("Right shift (v >> n): " + (v >> n));
        System.out.println("Unsigned right shift (v >>> n): " + (v >>> n));
    }
}
