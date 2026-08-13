package lesson4;

public class Switch {
    public static void main(String[] args) {
//        1 - monday ... 7
        int numberDay = 3;

        switch (numberDay) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("3начения не существует");
        }

//        if (numberDay == 1) {
//            System.out.println("Понедельник");
//        }
//        else if (numberDay == 2) {
//            System.out.println("Вторник");
//        }
    }
}
