package Basic;

class NotFibonacciSimple {
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        int N = 20;
        boolean[] fib = new boolean[N + 1];

        // Generate Fibonacci numbers
        while (a <= N) {
            fib[a] = true;
            c = a + b;
            a = b;
            b = c;
        }

        // Print non-Fibonacci numbers
        System.out.println("Not Fibonacci:");
        for (int i = 1; i <= N; i++) {
            if (!fib[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
