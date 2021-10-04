package com.alfa.controller;

public class Validator {
    public static int checkYear(String year) {
        int yy = Integer.parseInt(year);
        System.out.println(yy);
        if (yy < 1800 || yy > 2021) {
            throw new IllegalArgumentException("Error input year!");
        }
        return yy;
    }
}
