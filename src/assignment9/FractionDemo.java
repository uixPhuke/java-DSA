package assignment9;

/**
 * Program 1: Fraction Class
 * WAP in Java to design a class Fraction having data members num and denum.
 * Define default constructor, one argument constructor, two argument constructor
 * and a copy constructor to set the values to numerator and denominator of different objects.
 * Define methods such as show(), add(), subtract(), multiply(), div(), compare(),
 * mixed() and reduce().
 * Create different objects using different constructors given above.
 * Perform the above operations using appropriate methods.
 */

class Fraction {
    // Data members
    private int num;    // Numerator
    private int denum;  // Denominator

    // Default constructor - initializes fraction to 0/1
    public Fraction() {
        this.num = 0;
        this.denum = 1;
        System.out.println("Default constructor called: Fraction set to 0/1");
    }

    // One argument constructor - creates fraction as num/1
    public Fraction(int num) {
        this.num = num;
        this.denum = 1;
        System.out.println("One argument constructor called: Fraction set to " + num + "/1");
    }

    // Two argument constructor - creates fraction as num/denum
    public Fraction(int num, int denum) {
        if (denum == 0) {
            System.out.println("Error: Denominator cannot be zero. Setting denominator to 1.");
            this.denum = 1;
        } else {
            this.denum = denum;
        }
        this.num = num;
        this.reduce(); // Reduce fraction to simplest form
        System.out.println("Two argument constructor called: Fraction set to " + num + "/" + denum);
    }

    // Copy constructor - creates a new fraction identical to given fraction
    public Fraction(Fraction f) {
        this.num = f.num;
        this.denum = f.denum;
        System.out.println("Copy constructor called: Copied fraction " + f.num + "/" + f.denum);
    }

    // Method to display fraction in "numerator/denominator" format
    public void show() {
        System.out.println("Fraction: " + this.num + "/" + this.denum);
    }

    // Method to add two fractions
    public Fraction add(Fraction f) {
        int newNum = this.num * f.denum + f.num * this.denum;
        int newDenum = this.denum * f.denum;
        return new Fraction(newNum, newDenum);
    }

    // Method to subtract one fraction from another
    public Fraction subtract(Fraction f) {
        int newNum = this.num * f.denum - f.num * this.denum;
        int newDenum = this.denum * f.denum;
        return new Fraction(newNum, newDenum);
    }

    // Method to multiply two fractions
    public Fraction multiply(Fraction f) {
        int newNum = this.num * f.num;
        int newDenum = this.denum * f.denum;
        return new Fraction(newNum, newDenum);
    }

    // Method to divide current fraction by another fraction
    public Fraction div(Fraction f) {
        if (f.num == 0) {
            System.out.println("Error: Cannot divide by zero fraction");
            return new Fraction(); // Return default fraction
        }
        int newNum = this.num * f.denum;
        int newDenum = this.denum * f.num;
        return new Fraction(newNum, newDenum);
    }

    // Method to compare two fractions
    public int compare(Fraction f) {
        // Cross multiply to compare fractions
        int left = this.num * f.denum;
        int right = f.num * this.denum;

        if (left > right) {
            return 1; // Current fraction is greater
        } else if (left < right) {
            return -1; // Current fraction is smaller
        } else {
            return 0; // Fractions are equal
        }
    }

    // Method to convert improper fraction to mixed fraction
    public void mixed() {
        if (this.num == 0) {
            System.out.println("Mixed fraction: 0");
        } else if (this.num > 0) {
            // For positive fractions
            if (this.num < this.denum) {
                System.out.println("Proper fraction: " + this.num + "/" + this.denum);
            } else {
                int whole = this.num / this.denum;
                int remainder = this.num % this.denum;
                if (remainder == 0) {
                    System.out.println("Whole number: " + whole);
                } else {
                    System.out.println("Mixed fraction: " + whole + " " + remainder + "/" + this.denum);
                }
            }
        } else {
            // For negative fractions
            // Make numerator positive for calculation
            int positiveNum = -this.num;
            if (positiveNum < this.denum) {
                System.out.println("Proper fraction: " + this.num + "/" + this.denum);
            } else {
                int whole = positiveNum / this.denum;
                int remainder = positiveNum % this.denum;
                if (remainder == 0) {
                    System.out.println("Whole number: -" + whole);
                } else {
                    System.out.println("Mixed fraction: -" + whole + " " + remainder + "/" + this.denum);
                }
            }
        }
    }

    // Private method to reduce fraction to simplest form
    private void reduce() {
        int gcd = findGCD(this.num, this.denum);
        this.num = this.num / gcd;
        this.denum = this.denum / gcd;

        // Ensure denominator is positive
        if (this.denum < 0) {
            this.num = -this.num;
            this.denum = -this.denum;
        }
    }

    // Helper method to calculate Greatest Common Divisor (GCD) without Math functions
    private int findGCD(int a, int b) {
        // Make both numbers positive
        a = a < 0 ? -a : a;
        b = b < 0 ? -b : b;

        // Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Getter methods
    public int getNum() {
        return num;
    }

    public int getDenum() {
        return denum;
    }
}

// Main class for Fraction operations
public class FractionDemo {
    public static void main(String[] args) {
        System.out.println("========== FRACTION CLASS DEMONSTRATION ==========\n");

        System.out.println("1. CREATING FRACTIONS USING DIFFERENT CONSTRUCTORS:");
        System.out.println("---------------------------------------------------");

        // Create fractions using different constructors
        Fraction f1 = new Fraction();              // Default constructor
        System.out.print("f1: "); f1.show();

        Fraction f2 = new Fraction(5);            // One argument constructor
        System.out.print("f2: "); f2.show();

        Fraction f3 = new Fraction(3, 4);         // Two argument constructor
        System.out.print("f3: "); f3.show();

        Fraction f4 = new Fraction(8, 12);        // Will be reduced automatically
        System.out.print("f4: "); f4.show();

        Fraction f5 = new Fraction(f3);           // Copy constructor
        System.out.print("f5 (copy of f3): "); f5.show();

        Fraction f6 = new Fraction(7, 4);         // Improper fraction
        System.out.print("f6: "); f6.show();

        System.out.println("\n2. ARITHMETIC OPERATIONS:");
        System.out.println("-------------------------");

        // Addition
        System.out.print("f3 + f4 = ");
        Fraction sum = f3.add(f4);
        sum.show();

        // Subtraction
        System.out.print("f2 - f3 = ");
        Fraction difference = f2.subtract(f3);
        difference.show();

        // Multiplication
        System.out.print("f3 * f4 = ");
        Fraction product = f3.multiply(f4);
        product.show();

        // Division
        System.out.print("f2 / f3 = ");
        Fraction quotient = f2.div(f3);
        quotient.show();

        System.out.println("\n3. COMPARISON OPERATIONS:");
        System.out.println("--------------------------");

        // Compare fractions
        System.out.print("Comparing f3 and f4: ");
        int result1 = f3.compare(f4);
        if (result1 == 1) {
            System.out.println("f3 is greater than f4");
        } else if (result1 == -1) {
            System.out.println("f3 is less than f4");
        } else {
            System.out.println("f3 is equal to f4");
        }

        System.out.print("Comparing f3 and f5 (copy): ");
        int result2 = f3.compare(f5);
        if (result2 == 0) {
            System.out.println("f3 is equal to f5");
        }

        System.out.println("\n4. MIXED FRACTION REPRESENTATION:");
        System.out.println("----------------------------------");

        // Mixed fraction representation
        System.out.print("f6 (7/4) as mixed fraction: ");
        f6.mixed();

        Fraction f7 = new Fraction(11, 3);
        System.out.print("f7 (11/3) as mixed fraction: ");
        f7.mixed();

        Fraction f8 = new Fraction(4, 2);
        System.out.print("f8 (4/2) as mixed fraction: ");
        f8.mixed();

        Fraction f9 = new Fraction(-7, 4);
        System.out.print("f9 (-7/4) as mixed fraction: ");
        f9.mixed();

        System.out.println("\n5. REDUCTION DEMONSTRATION:");
        System.out.println("---------------------------");

        // Show reduction in action
        Fraction f10 = new Fraction(15, 25);
        System.out.print("15/25 after reduction: ");
        f10.show();

        Fraction f11 = new Fraction(24, 36);
        System.out.print("24/36 after reduction: ");
        f11.show();

        System.out.println("\n6. ADDITIONAL OPERATIONS:");
        System.out.println("-------------------------");

        // Chain operations
        System.out.print("(f3 + f4) * f6 = ");
        Fraction chainResult = f3.add(f4).multiply(f6);
        chainResult.show();

        // Division with error case
        Fraction zeroFraction = new Fraction(0, 1);
        System.out.print("f3 / zeroFraction = ");
        Fraction divisionResult = f3.div(zeroFraction);
        divisionResult.show();

        System.out.println("\n========== PROGRAM 1 COMPLETED ==========");
    }
}