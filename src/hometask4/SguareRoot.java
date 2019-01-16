package hometask4;

import Utilities.InputKey;

public class SguareRoot {
    public static void main(String[] args) {
        System.out.println("Введите коэфициент при х^2 (a!=0)");
        int a = InputKey.inputKey();
        System.out.println("Введите коэфициент при х (b)");
        int b = InputKey.inputKey();
        System.out.println("Вольный член (c)");
        int c = InputKey.inputKey();


     double D = Discriminant(a,b,c);

     if (D>0) {

         double x1 = (-b + Math.pow(D, 1 / 2)) / 2 * a;
         double x2 = (-b + Math.pow(D, 1 / 2)) / 2 * a;
         System.out.println("х1=  " + x1);
         System.out.println("х2=  " + x2);
     }
         else if(D==0){
  double x = -b/2*a;
         System.out.println("Так как дискриминант равен 0, уравнение имеет единственный корень х=  " + x);
         }
         else{
         System.out.println("Уравнение не имеет корней, так как дискриминант меньше 0");
         }
     }
    public  static double Discriminant(int a, int b, int c){
double D = Math.pow(b,2)-4*a*c;
return D;
    }
}
