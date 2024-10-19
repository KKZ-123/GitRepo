package com.example.model;

public class Rectangle {
    private int length;
    private int width;
    private static int count;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
        count++;
    }

    public static int getCount(){
        return count;
    }
    public int getArea(){
        return this.length * this.width;
    }

    public void display(){
        System.out.println("Rectangle of length : " + this.length);
        System.out.println("Rectangle of width : " + this.width);
        System.out.println("Area of rectangle : "  + this.getArea());
    }
}
