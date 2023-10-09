package MathLab3;

import MathLab3.Method.RectangleMethod;

public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        RectangleMethod rectangleMethod= new RectangleMethod();
        utils.Start();

        try {
            while (true) {
                int functionNumber = utils.inputFunction();
                if (functionNumber != 0) {
                    double start = utils.inputStart();
                    double end = utils.inputEnd();
                    double e = utils.inputE();
                    rectangleMethod.rectangleMethodRight(start, end, e, functionNumber);
                    rectangleMethod.rectangleMethodLeft(start, end, e, functionNumber);
                    rectangleMethod.rectangleMethodMid(start, end, e, functionNumber);
                } else {
                    System.out.println("The program has completed its work");
                    break;
                }
            }
        } catch (java.util.NoSuchElementException ex) {
            System.out.println("The program has completed its work");
        }
    }
}
