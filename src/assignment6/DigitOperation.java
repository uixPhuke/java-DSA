package assignment6;

import java.util.Scanner;

class DigitOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0, count = 0;

        // Sum and count digits
        while (temp > 0) {
            sum += temp % 10;
            count++;
            temp /= 10;
        }

        System.out.println("Sum of digits: " + sum);
        System.out.println("Count of digits: " + count);

        System.out.print("Common digits: ");
        int sumTemp = sum;

        // Check digits of sum in original number
        while (sumTemp > 0) {
            int d = sumTemp % 10;
            int check = num;
            int flag = 0;   // flag instead of boolean

            while (check > 0) {
                if (check % 10 == d) {
                    flag = 1;   // found
                    break;
                }
                check /= 10;
            }

            if (flag == 1) {
                System.out.print(d + " ");
            }

            sumTemp /= 10;
        }
    }
}
