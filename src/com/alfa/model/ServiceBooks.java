package com.alfa.model;

import com.alfa.model.entity.Book;

import java.util.List;

public class ServiceBooks {
    private List<Book> books;

    public ServiceBooks() {
        this.books = SourceBooks.getBooks();
    }

    public List<String> getAllBooks() {
        return ConverterBooks.convert(books);
    }

    public void addBook(String param1, String param2, String param3, int param4, int param5, double param6) {
        books.add(new Book(param1, param2, param3, param4, param5, param6));
    }
}
