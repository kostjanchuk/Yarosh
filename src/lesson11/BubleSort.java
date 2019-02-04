package lesson11;

public class BubleSort {

    public static void swap(int a[]) {
        boolean Sorted = false;

        while (!Sorted) {
            Sorted = true;
            for (int i = 0; i < (a.length - 1); i++) {
                if (a[i] > a[i + 1]) {
                    int x = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = x;
                    Sorted = false;

                }
            }
        }
    }
}