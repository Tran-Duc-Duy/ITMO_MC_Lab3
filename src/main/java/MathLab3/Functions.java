package MathLab3;

public class Functions {
    public double f(double x, int number) {
        switch (number) {
            case (1) -> {
                return 2 * Math.pow(x, 2)  + 3 * x + 11;
            }
            case (2) -> {
                return -3 * Math.pow(x, 3) + Math.pow(x, 2) - 0.6;
            }
            case (3) -> {
                return 2 * Math.sin(x) - Math.tan(x);
            }
            case (4) -> {
                return 1 / x;
            }
            default -> {
                System.out.println("Please enter 1-4");
                return f(x, number);
            }
        }

    }

    private double f_dx(double x, int number) {
        switch (number) {
            case (1) -> {
                return 2 * Math.pow(x, 3) / 3 + 3 * Math.pow(x, 2) / 2 + 11 * x;
            }
            case (2) -> {
                return -3 * Math.pow(x, 4) / 4 + Math.pow(x, 3) / 3 - 0.6*x;
            }
            case (3) -> {
                return Math.log10(Math.cos(x)) - 2 * Math.cos(x) ;
            }
            case (4) -> {
                return Math.log(x);
            }
            default -> {
                System.out.println("Введите число в диапазоне 1-4");
                return f_dx(x, number);
            }
        }
    }

    public double getI(double a, double b, int number) {
        return f_dx(b, number) - f_dx(a, number);
    }
}
