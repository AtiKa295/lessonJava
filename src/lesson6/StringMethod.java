package lesson6;

import java.util.Arrays;
import java.util.SortedMap;

public class StringMethod {
    public static void main(String[] args) {
        String text = "Hellow World";
        String upperCase = text.toUpperCase();
        System.out.println(upperCase);

        String textLower = text.toLowerCase();
        System.out.println(textLower);

        int length = text.length();
        System.out.println(length);

        boolean contains = text.contains("Hello");
        System.out.println(contains);

        String replaceAll = text.replaceAll("r", "a");
        System.out.println(replaceAll);

        String repeat = text.repeat(10);
        System.out.println(repeat);

        String namees = "Yuri;Petr;Olga;Vasya";
        String[] split = namees.split(";");
        System.out.println(Arrays.toString(split));

        String word1 = "hi";
        String word2 = "friend";
        String result = word1 + word2;
        System.out.println(result);


        boolean startsWith = text.startsWith("Hel");
        System.out.println(startsWith);

        boolean endsWith = text.endsWith("world");
        System.out.println(endsWith);


        String substringed = text.substring(0, 5);
        System.out.println(substringed);

        String i = "hello".replaceAll("l", "a").toUpperCase();
        System.out.println(i);

    }
}
