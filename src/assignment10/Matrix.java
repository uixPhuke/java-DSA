package assignment10;

import java.util.*;

class ArrayOp {
    int arr[];
    int size;

    // Constructor
    ArrayOp(int n) {
        size = n;
        arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = 0;
    }

    // Input
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
    }

    // Display
    void display() {
        System.out.print("Array: ");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    // Sum & Average
    void sumAvg() {
        int sum = 0;
        for (int i : arr)
            sum += i;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (sum / size));
    }

    // Swap max & min
    void swapMaxMin() {
        int max = arr[0], min = arr[0];
        int maxIndex = 0, minIndex = 0;

        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        int temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;

        System.out.println("After swapping max & min:");
        display();
    }

    // Unique elements with occurrence
    void occurrence() {
        System.out.println("Element occurrences:");
        for (int i = 0; i < size; i++) {
            int count = 1;
            if (arr[i] == -999) continue;

            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -999; // mark visited
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
    }

    // Convert to single digit
    int singleDigit(int x) {
        while (x > 9) {
            int sum = 0;
            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }
            x = sum;
        }
        return x;
    }

    // Three digit numbers logic
    void threeDigitMax() {
        int max = 0;

        for (int i = 0; i < size; i += 3) {
            int a = (i < size) ? singleDigit(arr[i]) : 0;
            int b = (i + 1 < size) ? singleDigit(arr[i + 1]) : 0;
            int c = (i + 2 < size) ? singleDigit(arr[i + 2]) : 0;

            int num = a * 100 + b * 10 + c;
            System.out.println("Formed number: " + num);

            if (num > max)
                max = num;
        }

        System.out.println("Greatest = " + max);
    }
}

class ArrayDemo {
    public static void main(String[] args) {
        ArrayOp obj = new ArrayOp(7);

        obj.input();
        obj.display();
        obj.sumAvg();
        obj.swapMaxMin();
        obj.occurrence();
        obj.threeDigitMax();
    }
}