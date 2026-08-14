package Start.lesson6;

public class Practic2 {
    public static void main(String[] args) {
        String carMark = "Mercedes";
        String carModel = "W124";
        double price = 200_000;
        boolean hasAutmaticTransmission = true;

//        String phrase = String.format("Привет, я менеджер салона %s", carMark);
//        String phrase2 = String.format("У нас есть модель %s за %f", carModel, price);
//        String phrase3 = String.format("Есть ли у нее АКПП")
//        System.out.println(phrase);

        String result = """
                Привет, я менеджер салона %s
                У на есть модель - %s за %f
                Есть ли у нее АКПП?
                %s
                """.formatted(carMark, carModel, price, hasAutmaticTransmission ? "Да" : "Нет");
        System.out.println(result);
    }
}
