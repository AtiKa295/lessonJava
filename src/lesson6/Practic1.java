package lesson6;

import java.util.Arrays;

public class Practic1 {
    public static void main(String[] args) {
        String text = "my name Michail Ustyugov";
//        String aCase = text.substring(11).toLowerCase();
//        System.out.println(aCase);
//
//        String[] split = text.split(" ");
//        int length = split.length;
//        System.out.println(Arrays.toString(split));
//        System.out.println(length);
        String[] split = text.substring(11).toLowerCase().split(" ");
        for (String word : split) {
            System.out.println(word);
            System.out.println(word.length());
        }
    }
}
