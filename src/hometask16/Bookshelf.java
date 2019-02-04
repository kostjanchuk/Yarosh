package hometask16;

public class Bookshelf {
    private int counter;
    private Book[] books;


    public Bookshelf(int length) {
        this.books = new Book[length];
    }

    public void add(Book book) {

        if (counter < books.length) {
            books[counter++] = book;
        } else {
            System.out.println("Полка заполнена");
        }

    }

    public void showAllBooks() {

        for (int i = 0; i < counter; i++) {
            System.out.println("'" + books[i].getName() + "'" + " - " + books[i].getAuthor().getNameAuthor());
        }
    }


}


