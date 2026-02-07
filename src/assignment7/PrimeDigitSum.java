package assignment7;

import java.util.Scanner;

class PrimeDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter m: ");
        int m = sc.nextInt();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Required numbers:");

        for (int i = m; i <= n; i++) {

            // Check if i is prime
            int flag1 = 1;
            if (i < 2)
                flag1 = 0;
            else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        flag1 = 0;
                        break;
                    }
                }
            }

            // Find digit sum
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            // Check if digit sum is prime
            int flag2 = 1;
            if (sum < 2)
                flag2 = 0;
            else {
                for (int k = 2; k <= sum / 2; k++) {
                    if (sum % k == 0) {
                        flag2 = 0;
                        break;
                    }
                }
            }

            // Print number if both are prime
            if (flag1 == 1 && flag2 == 1) {
                System.out.println(i);
            }
        }
    }
}
