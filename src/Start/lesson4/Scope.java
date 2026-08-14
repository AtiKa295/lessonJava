package Start.lesson4;

public class Scope {
    public static void main(String[] args) {
        double priceCar = 10_000;

        if (priceCar > 9000) {
            double oldPriceCar = priceCar;
            priceCar *= 0.95;
            System.out.println(oldPriceCar);
        }
        System.out.println(priceCar);
    }
}
