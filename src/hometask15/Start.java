package hometask15;

import Utilities.InputKey;

public class Start {
    public static void main(String[] args) {
        Godzilla godzilla1 = new Godzilla();
        System.out.println("Сколь людей годзила сьела на этот раз?");
        int a = InputKey.inputKey();
        godzilla1.feed(a);

        System.out.println("Сколь людей годзила сьела на этот раз?");
        int d = InputKey.inputKey();
        godzilla1.feed(d);

    }

}
