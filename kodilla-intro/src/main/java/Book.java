public class Book {
    private String author;
    private String book;

    private Book (String author, String book) {
        this.author = author;
        this.book = book;
    }

    public static Book of (String author, String title) {
        return new Book(author, title);
    }

    public static void main(String[] args) {
        Book book = Book.of ("S.Rooney", "Normal people");
    }

}


