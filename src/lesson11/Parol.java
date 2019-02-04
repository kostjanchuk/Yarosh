package lesson11;

import Utilities.RandomNumbers;


public class Parol {

    static char[] CapitalLetters = {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'};
    static char[] SmallLetters = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
    static char[] Numbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    static char[] SpecialChar = {'!', '@', '#', '$', '%', '_'};


    public static char[] arrNumbers() {
        char[] a = new char[3];
        int length = Numbers.length;
        for (int i = 0; i < 3; i++) {
            int d = RandomNumbers.getRandom(0, length);
            a[i] = Numbers[d];
            Numbers[d] = Numbers[length - 1];
            Numbers[length - 1] = a[i];
            length--;
        }
        return a;
    }


    public static char[] arrSmallLetters() {
        char[] b = new char[2];
        int length = SmallLetters.length;
        for (int i = 0; i < 2; i++) {
            int d = RandomNumbers.getRandom(0, length);
            b[i] = SmallLetters[d];
            SmallLetters[d] = SmallLetters[length - 1];
            SmallLetters[length - 1] = b[i];
            length--;
        }
        return b;
    }


    public static char[] arrCapitalLetters() {
        char[] c = new char[2];
        int length = CapitalLetters.length;
        for (int i = 0; i < 2; i++) {
            int d = RandomNumbers.getRandom(0, length);
            c[i] = CapitalLetters[d];
            CapitalLetters[d] = CapitalLetters[length - 1];
            CapitalLetters[length - 1] = c[i];
            length--;
        }
        return c;
    }


    public static char[] getParol(char[] parol) {
        int x = 0;
        char a[] = arrNumbers();
        for (int i = 0; i < 3; i++) {
            parol[x] = a[i];
            x++;
        }

        char b[] = arrCapitalLetters();
        for (int i = 0; i < 2; i++) {
            parol[x] = b[i];
            x++;
        }

        char c[] = arrSmallLetters();
        for (int i = 0; i < 2; i++) {
            parol[x] = c[i];
            x++;
        }
        parol[7] = SpecialChar[RandomNumbers.getRandom(0, SpecialChar.length)];

        return parol;
    }

    public static void mix(char[] a) {

        for (int i = 0; i < a.length; i++) {
            int x = RandomNumbers.getRandom(0, a.length);
            char d = a[i];
            a[i] = a[x];
            a[x] = d;
        }
    }

}
