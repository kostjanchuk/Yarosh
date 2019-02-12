package hometask23;


public class SyntacticCorrectness {

    private String a;
    private int counter;

    public SyntacticCorrectness(String a) {
        this.a = a;
    }

    public char[]  getCharArray() {
        counter = 0;
        char[] b = a.toCharArray();

        char[] arr = new char[a.length()];


        for (int i = 0; i < b.length; i++) {
            if (b[i] == '{' || b[i] == '}' || b[i] =='(' || b[i] == ')' || b[i] =='[' || b[i] ==']') {
                arr[counter++] = b[i];
            }
        }
        return arr;
    }

        public void Check(char[] b){

        Stack a = new Stack(counter);
            for (int i = 0; i <counter; i++) {
                if (b[i] == '{' || b[i] == '}' || b[i] == '(' || b[i] == ')' || b[i] == '[' || b[i] == ']') {
                    a.push(b[i]);
                }
            }

                for ( int j = 0; j <counter; j++) {
                    if (b[j] == '{' || b[j] == '(' || b[j] == '[') {
                        a.pop();
                    }
                }
            for ( int j = 0; j <counter; j++) {
                if (b[j] == '}' || b[j] == ')' || b[j] == ']') {
                    if(Stack.state=true) {
                        a.push(b[j]);
                    }
                    if(Stack.state!=true)
                    {
                        System.out.println("Пример записан не правильно");
                        return;

                    }

                }
            }


            if (a.isFull() == true ) {
                    System.out.println("Пример записан правильно");
                }
                else {System.out.println("Пример записан не правильно");}
            }


    }





