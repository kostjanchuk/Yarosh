package lesson22;

public class Wolf extends Animal{
    private boolean predator;

    public Wolf(int age, int weight, String color, boolean predator) {
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
