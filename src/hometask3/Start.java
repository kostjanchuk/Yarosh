package hometask3;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("введите число: ");
        int b = in.nextInt();


        if (b % 2 == 1) {
            System.out.println(b + " -нечётное число");
        } else {
            System.out.println(b + " -чётное число");
        }
    }
}
