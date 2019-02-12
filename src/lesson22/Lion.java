package lesson22;

public class Lion extends Animal{
    private boolean predator;

    public Lion(int age, int weight, String color, boolean predator) {
        super(age, weight, color);
        this.predator = predator;
    }

    public String say(){
        String a = "Hello! I am a wild animal";
        if (predator==true){
            a = a + " and i am angry";
        }

        return a;
    }

}
