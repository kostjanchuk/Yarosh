package Utilities;

public class Arrays {
    public static double minElement(double d[]) {
        double min = d[0];
        double indx = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i] <= min) {

                min = d[i];


            } else {

                min = min;
            }

        }
        return min;
    }


    public static int minIndex(int d[]) {
        int min = d[0];
        int indx = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i] <= min) {
                min = d[i];
                indx = i;


            } else {

                min = min;
                indx = indx;
            }

        }
        return indx;
    }


    public static double maxElement(double d[]) {
        double max = d[0];
        for (int i = 0; i < d.length; i++) {
            if (d[i] >= max) {


                max = d[i];
            } else {

                max = max;
            }

        }
        return max;
    }


    public static void output(double d[]) {
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();
    }


    public static void output(char d[]) {
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();
    }

    public static void outputForEach(int d[]) {
        for (int i : d) {
            System.out.print(i + "; ");
        }
        System.out.println();
    }

}
