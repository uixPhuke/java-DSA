package assignment6;

import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num,t=num, sum = 0, digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }


        while (t> 0) {
            int r = t % 10;
            sum += Math.pow(r, digits);
            t /= 10;
        }

        if (sum == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}
