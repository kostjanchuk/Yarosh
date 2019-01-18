package hometask4;

import Utilities.InputKey;

public class TrainTraffic {
    public static boolean trainColisiom() {
        int S = 10;
        System.out.println("Скорость 1 поезда");
        double V1 = InputKey.inputKey();
        System.out.println("Скорость 2 поезда");
        double V2 = InputKey.inputKey();
        double T=S/(V1+V2);
        if (T*V1<= 4 && T*V2>=6) {
            System.out.println("столкнутся");
            return true;
        } else {
            System.out.println("не столкнутся");
            return false;

        }
    }
}

