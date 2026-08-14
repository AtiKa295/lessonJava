package Start.lesson6;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Michail";
        int age = 20;
//        String phrase = "My name is " + name + ". Мне " + age + " Лет";
//        System.out.println(phrase);
        String phrase = String.format("Меня зовут %s. Мне %d лет", name, age);
        System.out.println(phrase);
        System.out.printf("Меня зовут %s. Мне %d лет", name, age);
    }
}
