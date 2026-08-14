package OOP.lesson7;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("Yellow", 9, "Michail");
//        System.out.println(cat.color);
//        System.out.println(cat.weight);
//        System.out.println(cat.ownerName);
//        cat.color = "Red";
//        System.out.println(cat.color);
        cat.destroySofa("Michail");
        String animal = cat.hunt(false);
        String resultHunt2 = cat.hunt(false, false);
        cat.hunt("Morning");
//        System.out.println(animal);
        System.out.println(resultHunt2);



    }
}
