package OOP.lesson7.zoo;

import OOP.lesson7.Cat;
import OOP.lesson7.Dog;

public class zoo {
    public static void main(String[] args) {
        Cat cat = new Cat("grey", 20, "Egor");
        System.out.println(cat.color);
    }

    private Cat cat;
    private Dog dog;

    public zoo(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    public void feed(){
        cat.feed("Vika", "Feesh");
        dog.feed("Vika", "Meat");
    }

}
