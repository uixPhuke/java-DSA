package assignment2;

class Sphere {
    public static void main(String args[]) {
        double r = Double.parseDouble(args[0]);
        double pi = 3.14159;
        double volume = (4 / 3) * pi * r * r * r;
        double area = 4 * pi * r * r;

        System.out.println("The Volume of the Sphere is " + volume);
        System.out.println("The Area of the Sphere is " + area);
    }
}
