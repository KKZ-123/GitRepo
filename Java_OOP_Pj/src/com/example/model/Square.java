package com.example.model;

public class Square {
    private static double length;
    private static int count;

    public Square(double length){
        this.length = length;
        count++;
    }
    public static int getCount(){
        return count;
    }

    public double getArea(){
        return Math.pow(this.length, 2);
    }
    public void display(){
        System.out.println("Square of radius : " + this.length);
        System.out.println("Area of Square : "  + this.getArea());
    }
}
