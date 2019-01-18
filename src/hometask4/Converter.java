package hometask4;

import Utilities.InputKey;

public class Converter {
    public static int MetodConv() {
        System.out.println("Введите сумму для конвертации($)");
        int UAH = InputKey.inputKey();
        int USD = 28 * UAH;
        return USD;
    }
}
