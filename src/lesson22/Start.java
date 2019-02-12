package lesson22;


import Utilities.RandomNumbers;

public class Start {
    public static void main(String[] args) {
        Cat cat = new Cat(12,12,"Black","uzan");
        Dog dog = new Dog(5,24,"Yellow","Barsik");
        Fish fish= new Fish(3,2,"Green","Rubka");
        Lion lion = new Lion(10,100,"Brown",true);
        Wolf wolf =new Wolf(7,75,"Grey",true);




        Animal[] animals = new Animal[10];


        for (int i = 0; i <animals.length ; i++) {
            int a = RandomNumbers.getRandom(1, 6);
            if (a == 5) {
                animals[i] = cat;
            } else if (a == 4) {
                animals[i] = dog;
            } else if(a==3){
                animals[i] = fish;
        } else if(a==2){
            animals[i] = lion;
    } else if(a==1){
        animals[i] = wolf;
    }
        }


        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].say());
        }

    }



    }
