package hometask2;

public class Calc {

    public static double methodCalc1(double a, double b, double c) {
        return a + b * (c / 2);
    }


    public static double methodCalc2(double a, double b) {
        return (Math.pow(a, 2) + Math.pow(b, 2)) % 2;
    }


    public static double methodCalc3(double a, double b, double c) {
        return (a + b) / 12 * c % 4 + b;
    }


    public static double methodCalc4(double a, double b, double c) {
        return (a - b * c) / (a + b) % c;
    }
}
