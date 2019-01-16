package hometask6;


import Utilities.InputKey;

public class Start {
    public static void main(String[] args) {
        System.out.println("Обратный счет");
        Cycles.countDown();
        System.out.println("Введите число х = ");
        int x = InputKey.inputKey();
        Cycles.factorial(x);
Cycles.arithmeticProgression();

    }
}
