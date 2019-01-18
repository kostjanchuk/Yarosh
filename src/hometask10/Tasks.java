package hometask10;

import Utilities.Arrays;
import Utilities.RandomNumbers;

public class Tasks {

    public static void difference(int a[]) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sum1 = sum1 + a[i];
            } else {
                sum2 = sum2 + a[i];
            }
        }
        int diff = sum1 - sum2;
        System.out.println("Разницы сумм всех четных и всех нечетных чисел элементов числового массива " + diff);
    }

    public static void swapElements(char a[]) {
        char d = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = d;
        System.out.println("Последний элемент нового массива " + a[a.length - 1]);
        System.out.println("Первый элемент нового массива " + a[0]);

    }


    public static void swapMinMaxElemrts(double a[]) {

        ;
        double max = Arrays.maxElement(a);
        double min = Arrays.minElement(a);

        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                a[i] = min;


            } else if (a[i] == min) {
                a[i] = max;

            }


        }
        System.out.println("Смена местами максимального и минимального элемента массива");
        Arrays.output(a);
    }

    public static void twoTeams(){
        int[] d = new int[25];
        int sum1 = 0;
        int sum2 = 0;
        int[] c = new int[25];
        for (int i = 0; i <25 ; i++) {
              c[i] =RandomNumbers.getRandom(14,60);
        }

        for (int i = 0; i <25 ; i++) {
            d[i] =RandomNumbers.getRandom(14,60);
        }
        System.out.println("Возраст людей в 1 команде");
        Arrays.outputForEach(c);

        System.out.println("Возраст людей в 2 команде");
        Arrays.outputForEach(d);

        for (int i = 0; i <25 ; i++) {

            sum1= sum1 +c[i];
            sum2= sum2 +d[i];
        }
        double avrg1 = sum1/25;
        double avrg2 = sum2/25;

        if (avrg1>avrg2){
            System.out.println("Средний возраст людей в  первой команде "+ avrg1+" больше чем у второй "+avrg2);
        }
        else if(avrg1<avrg2){
            System.out.println("Средний возраст людей в второй команде "+ avrg2+" больше чем у первой "+avrg1);
        }
        else {
            System.out.println("Cредний возраз людей в командах равен");
        }
    }


    public static void inverse(double[] a){
        System.out.println("элементы массива в обратном порядке");
        for (int i = a.length-1; i >=0 ; i--) {
                System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static boolean comparison(int a[], int b[]){
        if (a.length==b.length) {
            for (int i = 0; i < a.length; i++) {
if(a[i]!=b[i]){
    System.out.println("Массивы не равны");
    return false;
}
            }

        }
        else {
            System.out.println("Массивы имеют разную длину");
        }
        System.out.println("Массивы равны");
        return true;
    }

    public static int[] copyArray(int[] a){
        int c[] = new int[a.length];
        for (int i = 0; i <a.length ; i++) {
c[i]=a[i];
        }
        return c;
    }
}

