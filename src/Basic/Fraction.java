package Basic;

class Fraction {
    int num;
    int den;

    // Default constructor
    Fraction() {
        num = 0;
        den = 1;
    }

    void show() {
        System.out.println(num + "/" + den);
    }

    public static void main(String[] args) {
        Fraction f = new Fraction();
        f.show();
    }
}
