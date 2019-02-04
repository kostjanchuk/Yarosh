package lesson11;

import Utilities.Arrays;

public class SelectionSort {


    public static void swap(int a[]) {

        for (int StartIndex = 0; StartIndex < a.length; StartIndex++) {
            int s = getMaxIndex(a, StartIndex);
            int x = a[StartIndex];
            a[StartIndex] = a[s];
            a[s] = x;

        }

    }

    public static int getMaxIndex(int d[], int StartIndex) {
        int maxIndex = StartIndex;
        int max = d[maxIndex];
        for (int i = StartIndex; i < d.length; i++) {
            if (d[i] >= max) {
                max = d[i];
                maxIndex = i;


            } else {

                max = max;
                maxIndex = maxIndex;
            }

        }
        return maxIndex;


    }

}
