package hometask4;

import Utilities.InputKey;

public class Summation {
    public static int sum() {
        int s = 0;
        System.out.println("Введите трехзначное число ");
        int n = InputKey.inputKey();
        int a = n % 10;
        s = s + a;

        n = n / 10;

        a = n % 10;

        s = s + a;

        n = n / 10;

        s = s + n;

        return s;
    }
}
