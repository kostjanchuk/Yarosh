package hometask19;

import Utilities.RandomNumbers;

public class Start {

    public static void main(String[] args) {


        Dog dog1 = new Dog();

        Cat cat1 = new Cat();

        Parrot parrot1 = new Parrot();


        Pet[] pets = new Pet[10];


        for (int i = 0; i < pets.length; i++) {
            int a = RandomNumbers.getRandom(1, 4);
            if (a == 3) {
                pets[i] = dog1;
            } else if (a == 2) {
                pets[i] = cat1;
            } else {
                pets[i] = parrot1;
            }
        }


        for (int i = 0; i < pets.length; i++) {
            pets[i].say();
        }

    }


}
