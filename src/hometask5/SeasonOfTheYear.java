package hometask5;
public class SeasonOfTheYear {
    public static void firstFunction(int s) {

        if (s >= 3 && s < 6) {
            System.out.println("Весна");
        } else if (s >= 6 && s < 9) {
            System.out.println("Лето");
        } else if (s >= 9 && s < 12) {
            System.out.println("Осень");
        } else {
            System.out.println("Зима");
        }
    }

    public static void secondFunction(int s) {

        switch (s){
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
        }
    }
}
