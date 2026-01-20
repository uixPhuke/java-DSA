package assignment3;

import java.util.Scanner;

class Rupee {
    public static void main(String args[]) {
        int rs, rs2000, rs500, rs200, rs100, rs50, rs20, rs10, rs5, rs2, rs1;
        Scanner S = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        rs = S.nextInt();

        if (rs / 2000 > 0) {
            rs2000 = rs / 2000;
            rs = rs % 2000;
            System.out.print("(2000*" + rs2000 + ")");
        }

        if (rs / 500 > 0) {
            rs500 = rs / 500;
            rs = rs % 500;
            System.out.print("+(500*" + rs500 + ")");
        }

        if (rs / 200 > 0) {
            rs200 = rs / 200;
            rs = rs % 200;
            System.out.print("+(200*" + rs200 + ")");
        }

        if (rs / 100 > 0) {
            rs100 = rs / 100;
            rs = rs % 100;
            System.out.print("+(100*" + rs100 + ")");
        }

        if (rs / 50 > 0) {
            rs50 = rs / 50;
            rs = rs % 50;
            System.out.print("+(50*" + rs50 + ")");
        }

        if (rs / 20 > 0) {
            rs20 = rs / 20;
            rs = rs % 20;
            System.out.print("+(20*" + rs20 + ")");
        }

        if (rs / 10 > 0) {
            rs10 = rs / 10;
            rs = rs % 10;
            System.out.print("+(10*" + rs10 + ")");
        }

        if (rs / 5 > 0) {
            rs5 = rs / 5;
            rs = rs % 5;
            System.out.print("+(5*" + rs5 + ")");
        }

        if (rs / 2 > 0) {
            rs2 = rs / 2;
            rs = rs % 2;
            System.out.print("+(2*" + rs2 + ")");
        }

        if (rs / 1 > 0) {
            rs1 = rs / 1;
            rs = rs % 1;
            System.out.print("+(1*" + rs1 + ") ");
        }
    }
}
