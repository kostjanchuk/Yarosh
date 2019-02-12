package hometask23;

import Utilities.Arrays;

public class Stack {
    private int max;
    private char[] stackArray;
    private int top;
    public static boolean state = true;

    public Stack(int max) {
        this.max = max;
        stackArray = new char[max];
        top = -1;
    }

    public void push(char a) {
        if (top < max - 1) {
            stackArray[++top] = a;
        } else {
             state = false;
            System.out.println("Stack is overflow");
        }
    }


    public void showArray(){
        for (int i = 0; i <=top ; i++) {
            System.out.print(stackArray[i]+" ");
        }
        System.out.println();
    }

    public int pop() {
        if (isEmpty()!=true){
            return stackArray[top--];

        }
        else {
            return 0;
        }
    }

    public int peek() {
        if (isEmpty()!=true){
            return stackArray[top];
        }
        else {
            return 0;
        }


    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == max - 1);
    }

}
