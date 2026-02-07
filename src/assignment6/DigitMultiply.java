package assignment6;

import java.util.Scanner;

class DigitMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        while (num >= 10) {
            int product = 1;
            while (num > 0) {
                int d = num % 10;
                if (d != 0)
                    product *= d;
                num /= 10;
            }
            num = product;
        }

        System.out.println("Final single digit: " + num);
    }
}
