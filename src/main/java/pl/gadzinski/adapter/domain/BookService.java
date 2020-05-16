package pl.gadzinski.adapter.domain;

import java.util.List;

public class BookService {
public void showBooks(List<Book> books){
    books.forEach(book-> System.out.println(book));
}
}
