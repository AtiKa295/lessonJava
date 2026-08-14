package Start.lesson3;

public class Primitives {
    public static void main(String[] args) {
        //Логические значения (булевы значения)
        //ИСТИНА = True = 1
        boolean answerMichail = true;
        //ЛОЖь = False = 0
        boolean answerNazar = false;

        //Целый числа
        //Byte - Байт
        byte maxByte = 127;
        byte minByte = -128;

        //Short - короткое число из двух байт, или 16 битов
        short maxShort = 32_767;
        short minShort = -32_768;

        //Integer - Целое число, которое состоит из 4 байт, или 32 битов
        int maxInteger = 2_147_483_647;
        int minInteger = -2_147_483_648;

        //Long - целое число, которое состоит из 8 байт или 64 битов
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;

        //Какие типы данных вы бы использовали, для ответов на вопросы: Integer
        //Сколько людей на планете? - long
        //Сколько рук у человека - byte
        //Есть сигнал или нет? - boolean
        //Количество стран в мире? - short
        //Сколько жителей в Монако? - integer

        //Double - число с плавающей точкой, которая имеет 64 бита
        double meBottle = 1.5;
        //Float - число с плавающей точкой, которая имеет 32 бита
        float cola = 0.33F;

        double doubleNumber = 1.12345678901234567890;
        float floatNumber = 1.12345678901234567890F;
//        System.out.println(doubleNumber);
//        System.out.println(floatNumber);

        //Char - character (Символ), 16 бит
        char letter = 70;
        //System.out.println(letter);

        char newLine = '\n';
        System.out.print("a");
        System.out.print(newLine);
        System.out.print("b\n");
        char tab = '\t';
        char escape = '\\';
        System.out.println(escape);
    }
}
