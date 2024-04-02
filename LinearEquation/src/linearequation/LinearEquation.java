
package linearequation;
import java.util.Scanner;
public class LinearEquation {
    private double a, b, c, d, e, f;

    public LinearEquation() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }
    
    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getD() {
        return this.d;
    }

    public double getE() {
        return this.e;
    }

    public double getF() {
        return this.f;
    }

    public boolean isSolvable() {
        return (this.a * this.d - this.b * this.c) != 0;
    }

    public double getX() {
        if (isSolvable()) {
            return (this.e * this.d - this.b * this.f) / (this.a * this.d - this.b * this.c);
        } else {
            return Double.NaN; // Return NaN (Not a Number) for non-solvable equations
        }
    }

    public double getY() {
        if (isSolvable()) {
            return (this.a * this.f - this.e * this.c) / (this.a * this.d - this.b * this.c);
        } else {
            return Double.NaN; // Return NaN (Not a Number) for non-solvable equations
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        double a = scanner.nextDouble();

        System.out.print("Masukkan nilai b: ");
        double b = scanner.nextDouble();

        System.out.print("Masukkan nilai c: ");
        double c = scanner.nextDouble();

        System.out.print("Masukkan nilai d: ");
        double d = scanner.nextDouble();

        System.out.print("Masukkan nilai e: ");
        double e = scanner.nextDouble();

        System.out.print("Masukkan nilai f: ");
        double f = scanner.nextDouble();

        LinearEquation equation = new LinearEquation();
        equation.a = a;
        equation.b = b;
        equation.c = c;
        equation.d = d;
        equation.e = e;
        equation.f = f;

        if (equation.isSolvable()) {
            System.out.println("Persamaan memiliki solusi:");
            System.out.println("x = " + equation.getX());
            System.out.println("y = " + equation.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi.");
        }

        scanner.close();
    }
}
