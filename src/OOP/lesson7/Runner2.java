package OOP.lesson7;

import OOP.lesson7.zoo.zoo;

public class Runner2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Badi", -10, "Vika");
        Cat cat = new Cat("grey", 10, "Egor");
        zoo Zoo = new zoo(cat, dog);
        Zoo.feed();



//        System.out.println(dog);
//        dog.setWeight(-10);
//        System.out.println(dog);
//
//
//        System.out.println(dog.getOwner());
//
//        Dog dog2 = new Dog();
//        System.out.println(dog2);

    }
}
