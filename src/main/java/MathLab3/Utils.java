package MathLab3;

import java.util.Scanner;

public class Utils {
    Scanner in = new Scanner(System.in);

    public void Start() {
        System.out.println("This program was written by a foreign student who struggled to pass this lab!!! Let's cheer for me");
    }

    public int inputFunction() {
        while (true) {
            System.out.print("""
                    Select function:
                    1. 2*x^2 + 3*x + 11
                    2. -3*x^3 + x^2 - 0.6
                    3. 2sin(x) - tan(x)
                    4. 1 / x
                    0. Exit
                    -> Function number:\s""");
            try {
                int functionNumber = Integer.parseInt(in.next().trim());
                if (functionNumber == 1 || functionNumber == 2 || functionNumber == 3 || functionNumber == 4 || functionNumber == 0)
                    return functionNumber;
            } catch (NumberFormatException ignored) {
                System.out.println("Please enter 1-4");
            }
        }
    }
    public int inputStart() {
        while (true) {
            System.out.print("Enter lower integer limit of integration - start: ");
            try {
                return Integer.parseInt(in.next().trim());
            } catch (NumberFormatException ignored) {
            }
        }
    }

    public int inputEnd() {
        while (true) {
            System.out.print("Enter the upper integer limit of integration - end: ");
            try {
                return Integer.parseInt(in.next().trim());
            } catch (NumberFormatException ignored) {
            }
        }
    }

    public double inputE() {
        while (true) {
            System.out.print("Enter precision e: ");
            try {
                return Double.parseDouble(in.next().trim().replaceAll(",", "\\."));
            } catch (NumberFormatException ignored) {
            }
        }
    }
    public void outAnswer(double e, double answer, double I, double r, long n){
        System.out.println("\n------------------------------------------");
        System.out.println("The specified accuracy e has been reached = " + e);
        System.out.printf("Calculated I = %.5f\n", answer);
        System.out.printf("Standard I = %.5f\n", I);
        System.out.printf("Absolute error |R| = %.5f\n", r);
        System.out.printf("Relative error E = %.5f", Math.abs(100*r/((I+answer)/2)));
        System.out.println("%");
        System.out.println("n = " + n);
        System.out.println("------------------------------------------\n");
    }
}
