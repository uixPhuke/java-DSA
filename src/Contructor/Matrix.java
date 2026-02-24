package Contructor;

import java.util.Scanner;
class Matrix {
    int mat[][];
    int n;
    void createMatrix(int size) {
        n = size;
        mat = new int[n][n];
    }
    void inputMatrix() {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }
    void showMatrix() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    Matrix addMatrix(Matrix m) {
        Matrix temp = new Matrix();
        temp.createMatrix(n);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                temp.mat[i][j] = mat[i][j] + m.mat[i][j];
            }
        }
        return temp;
    }
}
class MatrixTest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();
        m1.createMatrix(size);
        m2.createMatrix(size);
        System.out.println("Enter first matrix:");
        m1.inputMatrix();
        System.out.println("Enter second matrix:");
        m2.inputMatrix();
        Matrix sum = m1.addMatrix(m2);
        System.out.println("Sum Matrix:");
        sum.showMatrix();
    }
}