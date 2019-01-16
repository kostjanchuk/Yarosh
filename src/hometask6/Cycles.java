package hometask6;

import Utilities.InputKey;

public class Cycles {
    public static void countDown(){
        int x =10;
        do {

                System.out.print(x+" ");

            x--;
        }
        while (x>=1);
        System.out.println();
    }
    public static void factorial(int x){
        int f =1;
        for (int i = 1; i <=x ; i++) {
 f= f*i;
        }
        System.out.println("x! = "+f);
    }

    public static void arithmeticProgression(){
        System.out.println("Введите первый член арефметической прогрессии");
        int a = InputKey.inputKey();
        System.out.println("Введите конечное количество элементов прогрессии");
        int b = InputKey.inputKey();
        System.out.println("Введите шаг арефметической прогрессии");
        int d = InputKey.inputKey();
    do {
        System.out.print(a+" ");
        a=a+d;
 b--;
    }
    while (b>0);
        System.out.println();
    }
}
