package lesson5;

public class Practic2 {
    public static void main(String[] args) {
        int[] numbers2 = {3, 2, 10,5, 8};
        for (int number : numbers2) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
