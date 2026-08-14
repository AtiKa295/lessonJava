package Start.lesson6;

public class TextBlock {
    public static void main(String[] args) {
        String text = "Привет, как тебя зову";
        String name1 = "Michail";
        String name2 = "Nazar";

        String text2 = """
                Привет, как тебя зовут?
                Меня зовут %s. А тебя?
                Меня %s!
                """.formatted(name1, name2);
        System.out.println(text2);
    }
}
