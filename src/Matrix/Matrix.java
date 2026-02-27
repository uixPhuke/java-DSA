package Matrix;

class Matrix {
    int rows, cols;
    int[][] mat;

    // Default constructor
    Matrix() {
        rows = 2;
        cols = 2;
        mat = new int[rows][cols];
    }

    // Parameterized constructor
    Matrix(int r, int c) {
        rows = r;
        cols = c;
        mat = new int[rows][cols];
    }

    // Copy constructor
    Matrix(Matrix m) {
        rows = m.rows;
        cols = m.cols;
        mat = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = m.mat[i][j];
            }
        }
    }

    // Method to set values
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
}

class MatrixDemo {
    public static void main(String[] args) {

        // Using default constructor
        Matrix m1 = new Matrix();
        int[][] a = {{1, 2}, {3, 4}};
        m1.setValues(a);

        // Using parameterized constructor
        Matrix m2 = new Matrix(2, 2);
        int[][] b = {{5, 6}, {7, 8}};
        m2.setValues(b);

        // Using copy constructor
        Matrix m3 = new Matrix(m1);

        System.out.println("Matrix m1:");
        m1.display();

        System.out.println("Matrix m2:");
        m2.display();

        System.out.println("Matrix m3 (copy of m1):");
        m3.display();
    }
}