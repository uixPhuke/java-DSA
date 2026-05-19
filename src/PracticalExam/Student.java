
////Create a `Student` class with the following data members:
//
//        * `Name`
//        * `Roll`
//        * `Marks`
//
//Also, create a static method `CountSort()` that sorts the student objects based on their **percentage/marks in ascending order**.
//
//Finally, print the marksheet of all students after sorting.

package PracticalExam;

import java.util.Scanner;
class Student {
    String name;
    int roll;
    double marks;

    double percentage;

    Student(String n, int r, double m) {
        name = n;
        roll = r;
        marks = m;

    }


    static void countSort(Student[] s) {
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = 0; j < s.length - i - 1; j++) {
                if (s[j].marks < s[j + 1].marks) {
                    Student temp = s[j];
                    s[j]= s[j + 1];
                    s[j+1] = temp;
                }

            }

        }
    }


    void display() {
        System.out.println("name" + name + " roll " + roll + " marks" + marks);
    }

    public static void main(String[] args) {

        Student[] students={

            new Student("Ruhon",32,43.32),
           new Student ("Ram",32,43.343),
           new Student ("huf",35,53.445)
       };
//

        countSort(students);
        for (int i = 0; i < students.length ; i++) {
            students[i].display();

        }

    }
}