package com.alfa.model;

import com.alfa.controller.Validator;
import com.alfa.model.entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Book> search(String criteria, String param) {
        switch (criteria) {
            case "author":
                return books.stream().filter(book -> book.getAuthor().equalsIgnoreCase(param)).collect(Collectors.toList());
            case "publisher":
                return books.stream().filter(book -> book.getPulisher().equalsIgnoreCase(param)).collect(Collectors.toList());
            case "year":
                try {
                    return books.stream().filter(book -> book.getYear() == Validator.checkYear(param)).collect(Collectors.toList());
                } catch (NumberFormatException e) {
                    System.out.println("");
                }
                default:
                System.out.println("Wrong search criteria");
                return new ArrayList<Book>();
        }
    }
}
