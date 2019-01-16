package hometask8;

import Utilities.InputKey;
import Utilities.RandomNumbers;

public class Games {
    public static void tailsEagle() {
        int k = 0;
        int c = 0;
        for (int i = 0; i < 2000; i++) {
            int d = RandomNumbers.getRandom(1, 3);
            if (d == 1) {
                c = c + 1;
            } else {
                k = k + 1;
            }
        }
        System.out.println("Орел выпал " + k + " раз");
        System.out.println("Решка выпала " + c + " раз");
    }

    public static void ticTacToe() {
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    String cell = "X";
                    System.out.printf(cell);
                } else {
                    String cell = "0";
                    System.out.printf(cell);
                }


            }
        }
        System.out.println();
    }


    public static void SummOfNumbers(){
        int d=0;
        for (int i = 0; i <100 ; i++) {
            int a = RandomNumbers.getRandom(-10,10);
            d=d+a;
        }
        System.out.println("Сумма случ чисел= "+d);
    }


    public static void guessTheNumber(){
        int a = RandomNumbers.getRandom(1,11);
        while (true){

            System.out.println("Угадай число от 1 до 10");
            int d = InputKey.inputKey();
            if (d==a){
                System.out.println("Красавчик, ты угадал число");
                break;
            }
            else if(d>a){
                System.out.println("Число которое следует угадать меньше ");
            }
            else {
                System.out.println("Число которое следует угадать больше");
            }

        }
    }
}
