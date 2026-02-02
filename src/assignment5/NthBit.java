package assignment5;

import java.util.Scanner;

class NthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = sc.nextInt();

        System.out.print("Input nth bit: ");
        int n = sc.nextInt();

        int bit = (num >> n) & 1;

        if (bit == 1)
            System.out.println(n + " bit of " + num + " is set 1");
        else
            System.out.println(n + " bit of " + num + " is set 0");
    }
}
