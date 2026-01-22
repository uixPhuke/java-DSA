package pattern;

public class Triangle {
    public static void main(String[] args){
        pattern1(4);
    }
    static void pattern1(int n){
        for (int row = 1; row <=n ; row++) {
            //to print no of rows
            //for every row run the col
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            //when one line is completed , we need to print newLine
            System.out.println(" ");

        }
    }
}
