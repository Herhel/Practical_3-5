package com.alfa.controller;

import com.alfa.model.ConverterBooks;
import com.alfa.model.ServiceBooks;
import com.alfa.view.ViewBooks;
import com.alfa.view.ViewConstants;

public class ControllerBooks {
    private ServiceBooks serviceBooks = new ServiceBooks();
    private ViewBooks viewBooks = new ViewBooks();

    public void execute() {
        while (true) {
            viewBooks.printMenu();
            String command = viewBooks.getCommand();
            switch (command) {
                case "view":
                    viewBooks.printBooks(serviceBooks.getAllBooks());
                    break;
                case "add":
                    processedAdd();
                    break;
                case "edit":
                    break;
                case "publisher", "author", "year":
                    search(command, viewBooks.getSearchParam());
                    break;
                case "exit":
                    System.exit(1);
                default:
                    viewBooks.printMessage(ViewConstants.ERROR);
            }
            viewBooks.printMessage(ViewConstants.SEPARATOR);
        }
    }

    private void processedAdd() {
        while (true) {
            String bookParams = viewBooks.getInfoBook();
            String[] params = bookParams.split(";");
            try {
                int year = Validator.checkYear(params[3]);
                int pages = Validator.checkPages(params[4]);
                double price = Validator.checkPrice(params[5]);
                serviceBooks.addBook(params[0], params[1], params[2], year, pages, price);
                break;
            } catch (IllegalArgumentException e) {
                viewBooks.printMessage(e.getMessage());
            }
        }
    }

    private void search (String criteria, String param) {
        viewBooks.printBooks(ConverterBooks.convert(serviceBooks.search(criteria, param)));
    }


}
