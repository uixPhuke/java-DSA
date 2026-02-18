package Basic;

import java.util.Scanner;

class NotFibonacci {

    // Check perfect square
    static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return s * s == x;
    }

    // Check Fibonacci number
    static boolean isFibonacci(int n) {
        return isPerfectSquare(5 * n * n + 4) ||
                isPerfectSquare(5 * n * n - 4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int N = sc.nextInt();

        System.out.println("Numbers NOT in Fibonacci series:");
        for (int i = 1; i <= N; i++) {
            if (!isFibonacci(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
