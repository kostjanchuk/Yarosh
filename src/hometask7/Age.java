package hometask7;

import Utilities.InputKey;

public class Age {
    public static void yearOfBirth() {
        System.out.println("Введите год рождения");
        int year = InputKey.inputKey();
        int age = 2019 - year;
        System.out.println("Текущий возраст пользователя " + age);
    }
}
