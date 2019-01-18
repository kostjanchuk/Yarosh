package hometask9;

import java.sql.SQLOutput;

public class Arrays {
    public static void minElement(int a[]){
        int min =a[0];
        for (int i = 0; i <a.length ; i++) {
           if (a[i]<=min){
               min = a[i];
           }
           else {

               min = min;
           }

        }
        System.out.println(min);
    }


    public static void maxElement(double d[]){
        double max =d[0];
        for (int i = 0; i <d.length ; i++) {
            if (d[i]>=max){


                max = d[i];
            }
            else {

                max = max;
            }

        }
        System.out.println(max);
    }

}

