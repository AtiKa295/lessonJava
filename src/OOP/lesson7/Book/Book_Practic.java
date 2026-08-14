package OOP.lesson7.Book;

public class Book_Practic {
    String name;
    String autor;
    int pages;
    boolean isNonFictions;

    public Book_Practic(String name, String autor, int pages, boolean isNonFictions) {
        this.name = name;
        this.autor = autor;
        this.pages = pages;
        this.isNonFictions = isNonFictions;
    }

    public void printCountRows() {
        System.out.println("Count rows in book: " + this.pages * 40);


    }


    public void printCountRows(int countRowsOnPage) {
        System.out.println("Count rows in book: " + this.pages * countRowsOnPage);
    }


    public void printInfo() {
        System.out.printf("%s ot %s - %s\n", this.name, this.autor,
                this.isNonFictions ? "Doc" : "Not doc");
        printCountRows();
    }
}
