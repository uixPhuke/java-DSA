package assignment7;

import java.util.Scanner;

class Series1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
            System.out.print("1/" + i + " ");
            if(i<n){
                System.out.print("+ ");
            }
        }

        System.out.println("\nSum = " + sum);
    }
}
