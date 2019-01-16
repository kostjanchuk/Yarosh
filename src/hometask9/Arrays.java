package hometask9;

import java.sql.SQLOutput;

public class Arrays {
    public static void minElement(int a[]){
        int min =0;
        for (int i = 0; i <a.length ; i++) {
           if (a[i]<=a[1]){

               a[1]=a[i];
               min = a[i];
           }
           else {
               a[1]=a[1];
               min = a[1];
           }

        }
        System.out.println(min);
    }


    public static void maxElement(double d[]){
        double max =0;
        for (int i = 0; i <d.length ; i++) {
            if (d[i]>=d[1]){

                d[1]=d[i];
                max = d[i];
            }
            else {
                d[1]=d[1];
                max = d[1];
            }

        }
        System.out.println(max);
    }

}

