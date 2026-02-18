package Class;



class Student1 {

    //  Instance variables
    int roll;
    String name;

    // Static variable
    static String college = "KIIT";

    // Constructor
    Student1(int roll, String name) {
        this.roll = roll;     // this → instance variable
        this.name = name;
    }

    //  Instance method
    void display() {
        // Local variable
        int year = 2026;

        System.out.println("Roll   : " + roll);
        System.out.println("Name   : " + name);
        System.out.println("College: " + college);
        System.out.println("Year   : " + year);
        System.out.println("-------------------");
    }


}

class MainClass{

    public static void main(String[] args) {

        // Object creation
        Student s1 = new Student(101, "Raj");
        Student s2 = new Student(102, "Aman");

        s1.display();
        s2.display();
    }
}
