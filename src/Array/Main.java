package Array;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number of rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Declaring jagged array
        int arr[][] = new int[rows][];

        // Taking column size for each row
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of columns for row " + i + ": ");
            int cols = sc.nextInt();
            arr[i] = new int[cols];
        }

        // Taking elements from user
        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }

        // Displaying jagged array
        System.out.println("Contents of Jagged Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
