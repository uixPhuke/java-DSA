package Matrix;

class Matrix2 {
    int rows, cols;
    int[][] mat;

    // Parameterized constructor
    Matrix2(int r, int c) {
        rows = r;
        cols = c;
        mat = new int[rows][cols];
    }

    // Set matrix values
    void setValues(int[][] values) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = values[i][j];
            }
        }
    }

    // Display matrix
    void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Multiply two matrices
    static Matrix2 multiply(Matrix2 a, Matrix2 b) {
        if (a.cols != b.rows) {
            System.out.println("Matrix multiplication not possible");
            return null;
        }

        Matrix2 result = new Matrix2(a.rows, b.cols);

        for (int i = 0; i < a.rows; i++) {
            for (int j = 0; j < b.cols; j++) {
                for (int k = 0; k < a.cols; k++) {
                    result.mat[i][j] += a.mat[i][k] * b.mat[k][j];
                }
            }
        }
        return result;
    }
}
class MatrixMultiplication {
    public static void main(String[] args) {

        Matrix2 m1 = new Matrix2(2, 3);
        Matrix2 m2 = new Matrix2(3, 2);

        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{1, 2}, {3, 4}, {5, 6}};

        m1.setValues(a);
        m2.setValues(b);

        System.out.println("Matrix A:");
        m1.display();

        System.out.println("Matrix B:");
        m2.display();

        Matrix2 m3 = Matrix2.multiply(m1, m2);

        if (m3 != null) {
            System.out.println("Resultant Matrix:");
            m3.display();
        }
    }
}
