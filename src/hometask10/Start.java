package hometask10;

import Utilities.Arrays;

public class Start {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6, 2};
        int[] f = {1, 3, 4, 5, 6, 4};
        int[] z = {1, 3, 4, 5, 6};
        double[] c = {1, 2, 3, 4, 5, 6, 1};
        Tasks.difference(a);
        char[] charr = {'X', 'd', 'I', 'j', 'Y'};
        Tasks.swapElements(charr);
        Tasks.swapMinMaxElemrts(c);
        double[] h = {1, 2, 3, 4, 5, 6, 7};
        Tasks.twoTeams();
        Tasks.inverse(h);
        Tasks.comparison(f, a);
        Arrays.outputForEach(Tasks.copyArray(a));
    }
}