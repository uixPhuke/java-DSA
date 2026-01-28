package assignment5;

import java.util.Scanner;

class NthBitCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter nth bit: ");
        int n = sc.nextInt();

        int bit = (num >> n) & 1;

        System.out.println(n + " bit of " + num + " is set " + bit);
    }
}

