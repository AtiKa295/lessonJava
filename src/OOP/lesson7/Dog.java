package OOP.lesson7;

import java.util.Arrays;

public class Dog {
    private String name = "Mers";
    private int weight = 10;
    private String owner = "Rita";

    {
        System.out.println("Собака создалась");
    }


    public Dog(){
    }

    public void feed(String giver, String ... product) {
        System.out.printf("Human %s give for dog: %s\n", giver, Arrays.toString(product));
    }

    public Dog(String name, int weight, String owner) {
        if (weight < 1) {
            this.weight = 5;
        }else {
            this.weight = weight;
        }
        this.name = name;
        this.owner = owner;
    }

    public void setWeight(int newWeight){
        if (newWeight < 1) {
            this.weight = 5;
        }else {
            this.weight = newWeight;
        }
    }

    public String getOwner(){
        return "Ms " + owner;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }
}
