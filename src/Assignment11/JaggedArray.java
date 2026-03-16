package Assignment11;

import java.util.Scanner;

class JaggedArray {
    int[][] marks;
    String[] name = {"Child1", "Child2", "Child3", "Child4", "Child5"};
    int[] subjects = {3,5,2,6,4};

    JaggedArray() {
        marks = new int[5][];

        for(int i=0;i<5;i++) {
            marks[i] = new int[subjects[i]];
        }
    }

    void inputMarks() {
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<marks.length;i++) {
            System.out.println("Enter marks for " + name[i]);

            for(int j=0;j<marks[i].length;j++) {
                System.out.print("Subject " + (j+1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }
    }

    void displayMarks() {
        for(int i=0;i<marks.length;i++) {
            System.out.print(name[i] + " : ");

            for(int j=0;j<marks[i].length;j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }

    void totalMarks() {
        for(int i=0;i<marks.length;i++) {
            int total = 0;

            for(int j=0;j<marks[i].length;j++) {
                total += marks[i][j];
            }

            System.out.println(name[i] + " Total Marks = " + total);
        }
    }

    void marksAbove80() {
        for(int i=0;i<marks.length;i++) {
            int count = 0;

            for(int j=0;j<marks[i].length;j++) {
                if(marks[i][j] > 80)
                    count++;
            }

            System.out.println(name[i] + " Marks above 80 = " + count);
        }
    }

    void marksBelow30() {
        for(int i=0;i<marks.length;i++) {
            System.out.print(name[i] + " marks below 30 : ");

            for(int j=0;j<marks[i].length;j++) {
                if(marks[i][j] < 30)
                    System.out.print(marks[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        JaggedArray obj = new JaggedArray();

        obj.inputMarks();
        obj.displayMarks();
        obj.totalMarks();
        obj.marksAbove80();
        obj.marksBelow30();
    }
}