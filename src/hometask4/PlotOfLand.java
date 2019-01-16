package hometask4;

import Utilities.InputKey;

public class PlotOfLand {

    public static int Square(int a,int b){

       int sguare = a*b;
        System.out.println("Площадь участка "+sguare);
        return sguare;

    }

    public static int Perimetr(int a,int b){
        int perimetr = (a+b)*2;
        System.out.println("Периметр участка "+perimetr);
        return perimetr;
    }
}
