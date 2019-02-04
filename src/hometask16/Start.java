package hometask16;

public class Start {

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf(10);

        Book book1 = new Book("Булгаков", "Мастер и Маргарита", 100, "Роман");
        Book book2 = new Book("Достоевский", "Преступление и наказание", 100, "Роман");
        Book book3 = new Book("Сент-Экзюпери", "Маленький принц", 100, "Философская сказка");
        Book book4 = new Book("Уайльд", "Портрет Дориана Грея", 100, "Роман");


        bookshelf.add(book1);
        bookshelf.add(book2);
        bookshelf.add(book3);
        bookshelf.add(book4);

        bookshelf.add(book1);
        bookshelf.add(book2);
        bookshelf.add(book3);
        bookshelf.add(book4);


        bookshelf.showAllBooks();


    }
}
