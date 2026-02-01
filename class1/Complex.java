import java.lang.Math;
import java.util.Objects;

/**
 * Represents an immutable complex number (a + bi).
 */
public final class Complex {
    private final double real; // the real part
    private final double imaginary; // the imaginary part

    /**
     * Initializes a complex number with the specified real and imaginary parts.
     * @param real the real part
     * @param imaginary the imaginary part
     */
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Returns the real part of this complex number.
     * @return the real part
     */
    public double re() {
        return real;
    }

    /**
     * Returns the imaginary part of this complex number.
     * @return the imaginary part
     */
    public double im() {
        return imaginary;
    }

    /**
     * Returns the magnitude (absolute value) of this complex number.
     * @return the magnitude
     */
    public double abs() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    /**
     * Returns the phase angle (argument) of this complex number.
     * @return the phase angle in radians (between -PI and PI)
     */
    public double phase() {
        return Math.atan2(imaginary, real);
    }

    /**
     * Returns the sum of this complex number and the specified complex number.
     * @param other the other complex number
     * @return the complex number sum
     */
    public Complex plus(Complex other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    /**
     * Returns the difference between this complex number and the specified complex number.
     * @param other the other complex number
     * @return the complex number difference
     */
    public Complex minus(Complex other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    /**
     * Returns the product of this complex number and the specified complex number.
     * @param other the other complex number
     * @return the complex number product
     */
    public Complex times(Complex other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }

    /**
     * Returns the quotient of this complex number and the specified complex number.
     * @param other the other complex number
     * @return the complex number quotient
     */
    public Complex divides(Complex other) {
        if (other.real == 0 && other.imaginary == 0) {
            throw new ArithmeticException("Division by zero complex number");
        }
        double scale = other.real * other.real + other.imaginary * other.imaginary;
        return new Complex(
            (this.real * other.real + this.imaginary * other.imaginary) / scale,
            (this.imaginary * other.real - this.real * other.imaginary) / scale
        );
    }

    /**
     * Returns the conjugate of this complex number.
     * @return the complex conjugate
     */
    public Complex conjugate() {
        return new Complex(real, -imaginary);
    }

    @Override
    public String toString() {
        if (imaginary == 0) return real + "";
        if (real == 0) return imaginary + "i";
        if (imaginary < 0) return real + " - " + (-imaginary) + "i";
        return real + " + " + imaginary + "i";
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (this.getClass() != other.getClass()) return false;
        Complex that = (Complex) other;
        return (this.real == that.real) && (this.imaginary == that.imaginary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imaginary);
    }

    // A sample main method to demonstrate usage
    public static void main(String[] args) {
        Complex a = new Complex(5.0, 6.0);
        Complex b = new Complex(-3.0, 4.0);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Re(a) = " + a.re());
        System.out.println("Im(a) = " + a.im());
        System.out.println("b + a = " + b.plus(a));
        System.out.println("a - b = " + a.minus(b));
        System.out.println("a * b = " + a.times(b));
        System.out.println("a / b = " + a.divides(b));
        System.out.println("conj(a) = " + a.conjugate());
        System.out.println("|a| = " + a.abs());
    }
}
