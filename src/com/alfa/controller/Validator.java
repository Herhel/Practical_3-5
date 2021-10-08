package com.alfa.controller;

import com.alfa.view.ViewConstants;

public class Validator {
    public static int checkYear(String year) {
        int yy = Integer.parseInt(year);
        System.out.println(yy);
        if (yy < 1800 || yy > 2021) {
            throw new IllegalArgumentException(ViewConstants.ERROR_YEAR);
        }
        return yy;
    }

    public static int checkPages(String page) {
        int pg = Integer.parseInt(page);
        if (pg < 8) {
            throw new IllegalArgumentException(ViewConstants.ERROR_PAGES);
        }
        return pg;
    }

    public static double checkPrice(String price) {
        double pr = Double.parseDouble(price);
        if (pr < 0) {
            throw new IllegalArgumentException(ViewConstants.ERROR_PRICE);
        }
        return pr;
    }

    public static int checkPercent(String percent) {
        int pr = Integer.parseInt(percent);
        if (pr < 0) {
            throw new IllegalArgumentException(ViewConstants.ERROR_PERCENT);
        }
        return pr;
    }
}
