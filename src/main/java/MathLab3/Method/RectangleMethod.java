package MathLab3.Method;

import MathLab3.Functions;
import MathLab3.Utils;

public class RectangleMethod {
    Functions functions = new Functions();
    Utils outputFunctions = new Utils();

    public void rectangleMethodMid(double start, double end, double e, int number) {
        if (start > end) {
            double tmp = start;
            start = end;
            end = tmp;
        }
        double startNew = start, step, sum = 0, r = e + 1, I = functions.getI(start, end, number);
        long n = 2;

        while (r > e) {
            n *= 2;
            step = (end - startNew) / n;
            sum = 0;
            for (int i = 0; i < n; i++) {
                sum += functions.f(startNew + step / 2, number);
                startNew += step;
            }
            sum = sum * step;
            r = Math.abs(I - sum);
            startNew = start;
        }

        System.out.println("\nSolution by the method of middle rectangles:");

        if (Double.isNaN(sum) || Double.isNaN(I) || Double.isNaN(r) || Double.isNaN(Math.abs(100 * r / ((I + sum) / 2)))) {
            System.out.println("There is a discontinuity of the first kind in the selected interval!\n");
        } else {
            outputFunctions.outAnswer(e, sum, I, r, n);
        }
    }

    public void rectangleMethodLeft(double start, double end, double e, int number) {
        if (start > end) {
            double tmp = start;
            start = end;
            end = tmp;
        }
        double startNew = start, step, sum = 0, r = e + 1, I = functions.getI(start, end, number);
        long n = 2;

        while (r > e) {
            n *= 2;
            step = (end - startNew) / n;
            sum = 0;
            for (int i = 0; i < n; i++) {
                sum += functions.f(startNew, number);
                startNew += step;
            }
            sum = sum * step;
            r = Math.abs(I - sum);
            startNew = start;
        }

        System.out.println("\nSolution by the method of left rectangles:");

        if (Double.isNaN(sum) || Double.isNaN(I) || Double.isNaN(r) || Double.isNaN(Math.abs(100 * r / ((I + sum) / 2)))) {
            System.out.println("There is a discontinuity of the first kind in the selected interval!\n");
        } else {
            outputFunctions.outAnswer(e, sum, I, r, n);
        }
    }

    public void rectangleMethodRight(double start, double end, double e, int number) {
        if (start > end) {
            double tmp = start;
            start = end;
            end = tmp;
        }
        double startNew = start, step, sum = 0, r = e + 1, I = functions.getI(start, end, number);
        long n = 2;

        while (r > e) {
            n *= 2;
            step = (end - startNew) / n;
            startNew += step;
            sum = 0;
            for (int i = 0; i < n; i++) {
                sum += functions.f(startNew, number);
                startNew += step;
            }
            sum = sum * step;
            r = Math.abs(I - sum);
            startNew = start;
        }

        System.out.println("\nSolution by the method of right rectangles:");

        if (Double.isNaN(sum) || Double.isNaN(I) || Double.isNaN(r) || Double.isNaN(Math.abs(100 * r / ((I + sum) / 2)))) {
            System.out.println("There is a discontinuity of the first kind in the selected interval!\n");
        } else {
            outputFunctions.outAnswer(e, sum, I, r, n);
        }
    }
}
