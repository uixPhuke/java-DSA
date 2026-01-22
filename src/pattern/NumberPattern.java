package pattern;

public class NumberPattern {
    static void main(String[] args) {
        pattern4(5);
    }

    static void pattern4(int n) {
        for (int row = 0; row <=n ; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col);

            }
            System.out.println(" ");

        }
    }
}
