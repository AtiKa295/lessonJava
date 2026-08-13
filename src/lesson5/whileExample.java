package lesson5;

public class whileExample {
    public static void main(String[] args) {
        int count = 1;
        while (count < 100) {
            System.out.println(count);
            count++;
        }
        System.out.println("while закончился");

        while (true) {
            count++;
            System.out.println(count);
            if (count == 1_000_000){
                break;
            }
        }
        System.out.println("while 2 закончился");
    }
}
