package hometask7;

public class Cycles {
    public static void summOfNumbers() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }


    public static void oddNumbers() {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }


}
