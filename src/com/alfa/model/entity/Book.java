package com.alfa.model.entity;

public class Book {
    private static int nextId = 1;
    private int id;
    private String author;
    private String title;
    private String pulisher;
    private int year;
    private int page;
    private double cost;

    public Book(String author, String title, String pulisher, int year, int page, double cost) {
        id = nextId++;
        this.author = author;
        this.title = title;
        this.pulisher = pulisher;
        this.year = year;
        this.page = page;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPulisher() {
        return pulisher;
    }
    public void setPulisher(String pulisher) {
        this.pulisher = pulisher;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pulisher='" + pulisher + '\'' +
                ", year=" + year +
                ", page=" + page +
                ", cost=" + cost +
                '}';
    }
}
