package com.alfa.model;

import com.alfa.model.entity.Book;

import java.util.List;
import java.util.stream.Collectors;

public class ConverterBooks {
    public static List<String> convert(List<Book> books) {
        return books.stream()
                .map( e -> String.format("|%11s |%20s |%5s |%5d |%5d |%8.2f |",
                        e.getAuthor(), e.getTitle(), e.getPulisher(), e.getYear(), e.getPage(), e.getCost()))
                .collect(Collectors.toList());
    }
}
