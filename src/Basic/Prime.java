package Basic;

import java.util.Scanner;

class Prime {
    public static void main(String args[]) {
        Scanner S=new Scanner(System.in);
        int term1,term2,i;
        System.out.println("Enter 1st Term:");
        term1=S.nextInt();
        System.out.println("Enter 2nd Term:");
        term2=S.nextInt();

        System.out.println("The Prime between"+term1+"and"+term2+"is :");
        for (int num = term1; num <= term2; num++) {
            if (num <= 1) continue;

            boolean isPrime = true;

            for ( i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }

    }
}