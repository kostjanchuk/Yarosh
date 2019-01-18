package Utilities;

public class RandomNumbers {
    public static int getRandom(int min, int max) {
        int r = (int) ((max - min) * Math.random()) + min;
        return r;
    }
}
