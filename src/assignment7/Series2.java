package assignment7;

import java.util.Scanner;

class Series2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        double sum = 1.0;
        double power = 1.0;

        System.out.print("Series: 1 ");

        for (int i = 1; i <= n; i++) {
            power *= x;
            sum += 1.0 / power;
            System.out.print("+ 1/" + x + "^" + i + " ");
//            if(i<n){
//                System.out.print("+ ");
//            }
       }

        System.out.println("\nSum = " + sum);
    }
}



