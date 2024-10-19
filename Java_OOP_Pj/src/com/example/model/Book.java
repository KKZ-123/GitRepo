package com.example.model;

public class Book {
    private String title;
    private String subTitle;

    private static int totalBook = 0;

    public Book(String title, String subTitle){
        this.title = title;
        this.subTitle = subTitle;
        totalBook++;
    }
    public Book(String title){
        this.title = title;
        totalBook++;
    }
    public static int getTotalBook(){
        return totalBook;
    }
    public void display(){
        System.out.println("Title : " + this.title);
        System.out.println("Subtitle : "  + this.subTitle);
    }
}
