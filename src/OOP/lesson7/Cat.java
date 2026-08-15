package OOP.lesson7;

import java.util.Arrays;

public class Cat {
    public String color;
    double weight;
    private String ownerName;

    public Cat(String colorName, double weightCat, String owner){
        this.color = colorName;
        this.weight = weightCat;
        this.ownerName = owner;
    }

    public void destroySofa(String sofaOwner) {
        System.out.printf("Cat was destroyed sofa %s\n", sofaOwner);
    }

    public String hunt(boolean isDay) {
        if (isDay) {
            return "Mouse";
        }
        return "Owl";

    }

    public String hunt(boolean isDay, boolean succes){
        if (succes) {
            if (isDay){
                return "Mouse";
            }
            return "Owl";
        }
        return "Nothing";
    }


    public void hunt(String timesOfDay){
        if(timesOfDay.equals("Morning")) {
            System.out.println("Mouse");
        }else {
            System.out.println("Dog");
        }
    }

    public void feed(String giver, String ... product) {
        System.out.printf("Human %s give for cat: %s\n", giver, Arrays.toString(product));
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
