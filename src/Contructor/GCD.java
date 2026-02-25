package Contructor;

class GCD {
    public static void main(String[] args) {
        int a = 36, b = 60;

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        System.out.println("GCD = " + a);
    }
}