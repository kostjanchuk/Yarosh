package hometask16;

public class Book {


    private Author author;
    private String name;
    private int numbersOfPages;
    private String information;

    public Book(String nameAuthor, String name, int numbersOfPages, String information) {
        this.author = new Author(nameAuthor);
        this.name = name;
        this.numbersOfPages = numbersOfPages;
        this.information = information;


    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

}
