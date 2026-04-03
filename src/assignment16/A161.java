package assignment16;

import java.util.*;

interface IntOperations {
    void checkPositiveNegative();
    void checkEvenOdd();
    void checkPrime();
    void checkPalindrome();
    void factorial();
    void sumOfDigits();
}

class MyNumber implements IntOperations {
    private int num;

    // Default constructor
    MyNumber() {
        num = 0;
    }

    // Parameterized constructor using this
    MyNumber(int num) {
        this.num = num;
    }

    public void checkPositiveNegative() {
        if (num > 0)
            System.out.println("Positive Number");
        else if (num < 0)
            System.out.println("Negative Number");
        else
            System.out.println("Zero");
    }

    public void checkEvenOdd() {
        if (num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }

    public void checkPrime() {
        if (num < 2) {
            System.out.println("Not Prime");
            return;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime Number");
    }

    public void checkPalindrome() {
        int temp = num, rev = 0;

        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (rev == num)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public void factorial() {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial = " + fact);
    }

    public void sumOfDigits() {
        int temp = num, sum = 0;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}

class TestInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        MyNumber obj = new MyNumber(n);

        while (true) {
            System.out.println("\n1.Positive/Negative");
            System.out.println("2.Even/Odd");
            System.out.println("3.Prime");
            System.out.println("4.Palindrome");
            System.out.println("5.Factorial");
            System.out.println("6.Sum of Digits");
            System.out.println("7.Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: obj.checkPositiveNegative(); break;
                case 2: obj.checkEvenOdd(); break;
                case 3: obj.checkPrime(); break;
                case 4: obj.checkPalindrome(); break;
                case 5: obj.factorial(); break;
                case 6: obj.sumOfDigits(); break;
                case 7: System.exit(0);
                default: System.out.println("Invalid choice");
            }
        }
    }
}