package com.alfa.controller;

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
                case "view": viewBooks.printBooks(serviceBooks.getAllBooks()); break;
                case "add": proccessedAdd(); break;
                case "edit": break;
                case "author": break;
                case "publisher": break;
                case "year": break;
                case "exit": System.exit(1);
                default: viewBooks.printMessage(ViewConstants.ERROR);
            }
            viewBooks.printMessage(ViewConstants.SEPARATOR);
        }
    }

    private void proccessedAdd() {
        while (true) {
            String bookParams = viewBooks.getInfoBook();
            String[] params = bookParams.split(";");
            try {
                int year = Validator.checkYear(params[3]);
                int pages = Integer.parseInt(params[4]);
                double price = Double.parseDouble(params[5]);
                serviceBooks.addBook(params[0], params[1], params[2], year, pages, price);
                break;
            } catch (IllegalArgumentException exp) {
                viewBooks.printMessage(ViewConstants.ERROR_YEAR);
            }
        }
    }
}
