package hometask14;

import Utilities.InputKey;

public class Vector {
    private double x;
    private double y;
    private double z;

    public static String space = "three-dimensional";

    private void getVector() {
        System.out.println("Введите координату х ");
        x = InputKey.inputKey();
        System.out.println("Введите координату y ");
        y = InputKey.inputKey();
        System.out.println("Введите координату z ");
        z = InputKey.inputKey();
        System.out.println(x + " " + y + " " + z);

    }

    public double getLength() {
        getVector();
        double a = Math.sqrt(y * y + x * x + z * z);
        return a;
    }

    public void scalarMagnification(int a) {
        x = x + a;
        y = y + a;
        z = z + a;
        System.out.println(x + " " + y + " " + z);
    }


}
