package lesson4;

public class Practice {
    public static void main(String[] args) {

        //Практическое задание
        //Проверить работоспособность машины: двигатель(Engine) и трансмиссия(Transmission) - работают,
        //и хотя бы 3 колеса из 4 не проколоты
        //Если машина работоспособна - вывести на экран - машина готова к эксплуатации
        //Если машина НЕработоспособна - вывести на экран - машина сломана

        boolean isWorkEngine = true;
        boolean isWorkTransmission = true;
        boolean isFineWheel1 = true;
        boolean isFineWheel2 = true;
        boolean isFineWheel3 = true;
        boolean isFineWheel4 = true;
//
//        boolean workEngineAndTransmission = isWorkEngine && isWorkTransmission;
//        boolean wheelFine1 = isFineWheel1 && isFineWheel2 && isFineWheel3;
//        boolean wheelFine2 = isFineWheel1 && isFineWheel3 && isFineWheel4;
//        boolean wheelFine3 = isFineWheel2 && isFineWheel3 && isFineWheel4;
//        boolean wheelFine = wheelFine1 || wheelFine2 || wheelFine3;
//
//        boolean carFine = workEngineAndTransmission && wheelFine;
//        if (carFine == true) {
//            System.out.println("Все в норме");
//        } else if (carFine == false) {
//            System.out.println("Машина неиспрвна");
//    }


        int countFineWheels = 0;
        countFineWheels += isFineWheel1 ? 1 : 0;
        countFineWheels += isFineWheel2 ? 1 : 0;
        countFineWheels += isFineWheel3 ? 1 : 0;
        countFineWheels += isFineWheel4 ? 1 : 0;
        if (isWorkEngine && isWorkTransmission && (countFineWheels >= 3)) {
            System.out.println("Машина готова");
        } else {
            System.out.println("Машина сломана");
        }
    }
}
