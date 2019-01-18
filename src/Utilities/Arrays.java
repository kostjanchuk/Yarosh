package Utilities;

public class Arrays {
    public static double minElement(double mn[]) {
        double min =0;
        for (int i = 0; i <mn.length ; i++) {

            if (mn[i]<=mn[0]){

                mn[0]=mn[i];
                min = mn[i];
            }
            else {
                mn[0]=mn[0];
                min = mn[0];
            }

        }
        return min;
    }


    public static double maxElement(double mx[]) {
        double max = 0;
        for (int i = 0; i <mx.length ; i++) {

            if (mx[i]>=mx[0]){

                mx[0]=mx[i];
                max = mx[i];
            }
            else {
                mx[0]=mx[0];
                max = mx[0];
            }

        }
        return max;
        }


    public static void output(double d[]){
        for (int i = 0; i <d.length ; i++) {
            System.out.print(d[i]+" ");
        }
        System.out.println();
    }
    
    public static void outputForEach(int d[]){
        for (int i:d) {
            System.out.print(i+"; ");
        }
        System.out.println();
    }
    
}
