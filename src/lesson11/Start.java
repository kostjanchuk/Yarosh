package lesson11;

import Utilities.Arrays;

public class Start {

    public static void main(String[] args) {
        int a[] = {2, 7, 1, 9, 5, 1, 5, 7};
        SelectionSort.swap(a);
        Arrays.outputForEach(a);

        int d[] = {2, 1, 3, 9, 8, 5, 4, 7, 5, 9};
        BubleSort.swap(d);
        Arrays.outputForEach(d);

        char[] parol = new char[8];
        Parol.getParol(parol);
        Parol.mix(parol);
        Arrays.output(parol);


    }
}
