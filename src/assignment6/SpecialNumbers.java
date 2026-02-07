package assignment6;

class SpecialNumbers {
    public static void main(String[] args) {

        System.out.println("Special 4-digit numbers:");
        for (int i = 1000; i <= 9999; i++) {
            int first = i / 100;
            int last = i % 100;

            if ((first + last) * (first + last) == i) {
                System.out.println(i);
            }
        }
    }
}
