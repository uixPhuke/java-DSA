package assignment7;

import java.util.Scanner;

class Series4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i * i * i;
                System.out.print(i + "^3 ");
            } else {
                sum += i * i;
                System.out.print(i + "^2 ");
            }
            if (i < n) System.out.print("+ ");
        }

        System.out.println("\nSum = " + sum);
    }
}
