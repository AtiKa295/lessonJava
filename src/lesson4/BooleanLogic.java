package lesson4;

public class BooleanLogic {
    public static void main(String[] args) {
        boolean isBoaghtBread = true;
        boolean isBoaghtMilk = true;

//      AND - логическое и, если два значения true, то тогда true, иначе false

        boolean isBoaghtBradandMilk = isBoaghtBread && isBoaghtMilk;
//        boolean isBoaghtBradandMilk = true && true;
//        boolean isBoaghtBradandMilk = true;
//        boolean isBoaghtBradandMilk = false && true;
//        boolean isBoaghtBradandMilk = false && false;

//        if (isBoaghtBread && isBoaghtMilk) {
//            System.out.println("Молодец!");
//        } else if (isBoaghtMilk) {
//            System.out.println("МОлодец, хотя бы молоко");
//        } else if (isBoaghtBread) {
//            System.out.println("Молодец, хотя бы хдеб");
//        } else {
//            System.out.println("Где все???");
//        }

//        OR - Логическое или, если хотя бы одно значение true, то тогда true, и только если все значения false, то false

        boolean isBoaghtMilkOrBread = true || true;
//        boolean isBoaghtMilkOrBread = true || false;
//        boolean isBoaghtMilkOrBread = true;
//        boolean isBoaghtMilkOrBread = false || false;

//        NOT - Логическое НЕ, который переворачивает значение true to false, и наоборот
        boolean isBoaghtCandy = false;

        if (!isBoaghtCandy) {
            System.out.println("Похвала");
        }


    }
}
