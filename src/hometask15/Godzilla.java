package hometask15;

public class Godzilla {

    private int stomachVolume = 100;
    private int satiety;

    public void feed(int a) {
        satiety = a * 10;
        stomachVolume = stomachVolume - satiety;

        if (stomachVolume < 0) {
            System.out.println("Годзила не может сьесть столько людей ");

        } else if (stomachVolume >= 0 && stomachVolume <= 10) {
            System.out.println("Годзила наелся");
        } else {
            System.out.println("Нян-ням как вкусно, мне еще нужно сьесть минимум " + (stomachVolume / 10) + " людей что б наесться");

        }
    }


}
