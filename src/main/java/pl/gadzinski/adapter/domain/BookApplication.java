package pl.gadzinski.adapter.domain;

import java.util.List;

public class BookApplication {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        BooksFromTextFileAdapter booksFromTextFileAdapter = new BooksFromTextFileAdapter("C:\\Users\\gadzinski\\Desktop\\PROGRAMATOR\\!25.04 Spring\\Spring 9.05.2020\\zajecia_uzupelniajace\\src\\main\\resources\\books\\books.txt");
        List<Book> books =booksFromTextFileAdapter.readBooks();
        bookService.showBooks(books);
    }
}
