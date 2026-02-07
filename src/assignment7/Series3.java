package assignment7;

import java.util.Scanner;

class Series3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        double sum = 1.0;
        int fact = 1;

        System.out.print("Series: 1 ");

        for (int i = 2; i <= n; i++) {
            fact *= i;
            sum += 1.0 / fact;
            System.out.print("+ 1/" + i + "! ");
        }

        System.out.println("\nSum = " + sum);
    }
}
