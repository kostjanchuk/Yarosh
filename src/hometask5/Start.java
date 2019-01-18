package hometask5;

import Utilities.InputKey;

public class Start {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца");
        int s = InputKey.inputKey();
        SeasonOfTheYear.firstFunction(s);
        SeasonOfTheYear.secondFunction(s);

        System.out.println("Введите число");
        double x = InputKey.inputKey();
        System.out.println("При быстром делении числа на 4 получим " + FastDivision.bitDivByFour(x));

    }
}
