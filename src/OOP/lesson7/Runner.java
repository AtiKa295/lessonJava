package OOP.lesson7;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("Yellow", 9, "Michail");


        cat.destroySofa("Michail");
        String animal = cat.hunt(false);
        String resultHunt2 = cat.hunt(false, false);
        cat.hunt("Morning");
//        System.out.println(animal);

        cat.feed("Egor", "Корм", "Water");
        System.out.println(resultHunt2);



    }
}
