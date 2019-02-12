package hometask23;


import Utilities.Arrays;


public class Start {
    public static void main(String[] args) {

        Stack stack = new Stack(10);
        System.out.println("Является ли стэк пустым");
        System.out.println(stack.isEmpty());

        System.out.println("Является ли стэк полным");
        System.out.println(stack.isFull());

        stack.push('A');
        stack.push('B');
        stack.push('C');
        stack.push('D');
        stack.push('F');
        stack.push('E');
        stack.push('R');
        stack.push('T');
        stack.push('E');
        stack.push('R');
        stack.push('T');




        stack.showArray();

        System.out.println("Является ли стэк пустым");
        System.out.println(stack.isEmpty());

        System.out.println("Является ли стэк полным");
        System.out.println(stack.isFull());



        stack.pop();


        stack.showArray();
        System.out.println(stack.peek());

        System.out.println("Является ли стэк пустым");
        System.out.println(stack.isEmpty());

        System.out.println("Является ли стэк полным");
        System.out.println(stack.isFull());




        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();




        stack.showArray();


        System.out.println("Является ли стэк пустым");
        System.out.println(stack.isEmpty());

        System.out.println("Является ли стэк полным");
        System.out.println(stack.isFull());

        System.out.println(stack.peek());





        SyntacticCorrectness syntacticCorrectness = new SyntacticCorrectness("({x-у} + [{z * s} - a] + kb) + 12 - (t - v)");
        syntacticCorrectness.Check(syntacticCorrectness.getCharArray());



    }




}
