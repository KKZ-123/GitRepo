package com.example.main;

import com.example.model.Book;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainBook {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Book[] bookArr = new Book[100];
    public static void main(String[] args) {
        try {
            String flag = "yes"; // Initialize flag for entering the loop
            do {
                Book book = getBookInfo();
                bookArr[Book.getTotalBook() -1] = book;

                System.out.print("Do you want to add another book? (yes/no): ");
                flag = br.readLine(); // Read response for loop condition
            } while (flag.equalsIgnoreCase("yes"));

            display();
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }

    public static Book getBookInfo() throws IOException{
        System.out.print("Enter Book's Title: ");
        String title = br.readLine(); // Read title
        System.out.print("Enter Book's Subtitle: ");
        String subTitle = br.readLine(); // Read subtitle

        // Create book based on whether subtitle is provided
        Book book;
        if (subTitle.isEmpty()) {
            book = new Book(title); // Constructor for title only
        } else {
            book = new Book(title, subTitle); // Constructor for title and subtitle
        }
        return book;
    }

    public static void display(){
        for(int i = 0; i < Book.getTotalBook(); i++){
            bookArr[i].display();
        }
        System.out.println("Total Number of Books : " + Book.getTotalBook());
    }
}
