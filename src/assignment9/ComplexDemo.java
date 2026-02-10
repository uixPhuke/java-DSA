package assignment9;

/**
 * Program 2: Complex Class
 * Create a class Complex having member variables real and imag.
 * Also create constructors and methods as follows:
 * a. Complex()
 * b. Complex(int,int)
 * c. Complex(Complex)
 * d. void showComplex()
 * e. Complex addComplex(Complex)
 * f. Complex substractComplex(Complex)
 * g. Complex multiplyComplex(Complex)
 * Write a java program to create objects of above class and perform operations.
 */

class Complex {
    // Data members
    private int real;  // Real part
    private int imag;  // Imaginary part

    // a. Default constructor - initializes to 0 + 0i
    public Complex() {
        this.real = 0;
        this.imag = 0;
        System.out.println("Default constructor called: Complex set to 0 + 0i");
    }

    // b. Two argument constructor
    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
        System.out.println("Two argument constructor called: Complex set to " + real + " + " + imag + "i");
    }

    // c. Copy constructor
    public Complex(Complex c) {
        this.real = c.real;
        this.imag = c.imag;
        System.out.println("Copy constructor called: Copied complex number " + c.real + " + " + c.imag + "i");
    }

    // d. Method to display complex number
    public void showComplex() {
        if (imag >= 0) {
            System.out.println("Complex Number: " + real + " + " + imag + "i");
        } else {
            // Display with minus sign for negative imaginary part
            System.out.println("Complex Number: " + real + " - " + (-imag) + "i");
        }
    }

    // e. Method to add two complex numbers
    public Complex addComplex(Complex c) {
        int newReal = this.real + c.real;
        int newImag = this.imag + c.imag;
        Complex result = new Complex(newReal, newImag);
        System.out.print("Addition result: ");
        result.showComplex();
        return result;
    }

    // f. Method to subtract two complex numbers
    public Complex substractComplex(Complex c) {
        int newReal = this.real - c.real;
        int newImag = this.imag - c.imag;
        Complex result = new Complex(newReal, newImag);
        System.out.print("Subtraction result: ");
        result.showComplex();
        return result;
    }

    // g. Method to multiply two complex numbers
    public Complex multiplyComplex(Complex c) {
        // Formula: (a+bi)(c+di) = (ac - bd) + (ad + bc)i
        int newReal = (this.real * c.real) - (this.imag * c.imag);
        int newImag = (this.real * c.imag) + (this.imag * c.real);
        Complex result = new Complex(newReal, newImag);
        System.out.print("Multiplication result: ");
        result.showComplex();
        return result;
    }

    // Getter methods
    public int getReal() {
        return real;
    }

    public int getImag() {
        return imag;
    }
}

// Main class for Complex operations
public class ComplexDemo {
    public static void main(String[] args) {
        System.out.println("========== COMPLEX CLASS DEMONSTRATION ==========\n");

        System.out.println("1. CREATING COMPLEX NUMBERS USING DIFFERENT CONSTRUCTORS:");
        System.out.println("---------------------------------------------------------");

        // Create complex numbers using different constructors
        Complex c1 = new Complex();               // Default constructor
        System.out.print("c1: "); c1.showComplex();

        Complex c2 = new Complex(3, 4);          // Two argument constructor
        System.out.print("c2: "); c2.showComplex();

        Complex c3 = new Complex(1, -2);         // Negative imaginary part
        System.out.print("c3: "); c3.showComplex();

        Complex c4 = new Complex(-2, -3);        // Both parts negative
        System.out.print("c4: "); c4.showComplex();

        Complex c5 = new Complex(c2);            // Copy constructor
        System.out.print("c5 (copy of c2): "); c5.showComplex();

        System.out.println("\n2. ARITHMETIC OPERATIONS:");
        System.out.println("-------------------------");

        // Addition operations
        System.out.println("\n--- ADDITION ---");
        System.out.print("c2 + c3 = ");
        Complex sum1 = c2.addComplex(c3);

        System.out.print("c3 + c4 = ");
        Complex sum2 = c3.addComplex(c4);

        // Subtraction operations
        System.out.println("\n--- SUBTRACTION ---");
        System.out.print("c2 - c3 = ");
        Complex diff1 = c2.substractComplex(c3);

        System.out.print("c4 - c2 = ");
        Complex diff2 = c4.substractComplex(c2);

        // Multiplication operations
        System.out.println("\n--- MULTIPLICATION ---");
        System.out.print("c2 * c3 = ");
        Complex prod1 = c2.multiplyComplex(c3);

        System.out.print("c3 * c4 = ");
        Complex prod2 = c3.multiplyComplex(c4);

        System.out.println("\n3. CHAIN OPERATIONS:");
        System.out.println("-------------------");

        // Create new complex numbers for chain operations
        Complex c6 = new Complex(2, 3);
        Complex c7 = new Complex(1, 1);
        Complex c8 = new Complex(4, -1);

        System.out.println("\nNew complex numbers for chain operations:");
        System.out.print("c6: "); c6.showComplex();
        System.out.print("c7: "); c7.showComplex();
        System.out.print("c8: "); c8.showComplex();

        // Chain operation: (c6 + c7) * c8
        System.out.println("\nChain operation: (c6 + c7) * c8");
        System.out.print("First, c6 + c7 = ");
        Complex tempSum = c6.addComplex(c7);
        System.out.print("Then, (c6 + c7) * c8 = ");
        tempSum.multiplyComplex(c8);

        System.out.println("\n4. VERIFYING COPY CONSTRUCTOR:");
        System.out.println("------------------------------");

        // Verify copy constructor creates independent copy
        System.out.println("Original c2: ");
        System.out.print("c2: "); c2.showComplex();

        System.out.println("\nCopy c5 (should be same as c2): ");
        System.out.print("c5: "); c5.showComplex();

        // Create another copy and modify it
        Complex c9 = new Complex(c2);
        System.out.println("\nCreated c9 as copy of c2");
        System.out.print("c9: "); c9.showComplex();

        System.out.println("\n5. OPERATIONS WITH ZERO COMPLEX NUMBER:");
        System.out.println("----------------------------------------");

        Complex zero = new Complex();  // 0 + 0i
        System.out.print("Zero complex number: "); zero.showComplex();

        System.out.print("\nc2 + zero = ");
        c2.addComplex(zero);

        System.out.print("c2 * zero = ");
        c2.multiplyComplex(zero);

        System.out.println("\n6. OPERATIONS WITH CONJUGATES:");
        System.out.println("------------------------------");

        Complex c10 = new Complex(3, 4);
        Complex c11 = new Complex(3, -4);  // Conjugate of c10

        System.out.print("c10: "); c10.showComplex();
        System.out.print("c11 (conjugate of c10): "); c11.showComplex();

        System.out.print("\nc10 * c11 = ");
        Complex conjugateProduct = c10.multiplyComplex(c11);
        System.out.println("Note: Product of a complex number and its conjugate gives a real number!");

        System.out.println("\n========== PROGRAM 2 COMPLETED ==========");
    }
}