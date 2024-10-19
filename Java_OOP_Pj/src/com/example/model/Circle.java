package com.example.model;

public class Circle {
    private double radius;
    private static int count;

    public Circle(double radius){
        this.radius = radius;
        count++;
    }

    public static int getCount(){
        return count;
    }

    public double getArea(){
        return Math.PI*Math.pow(2, this.radius);
    }
    public void display(){
        System.out.println("Circle of radius : " + this.radius);
        System.out.println("Area of Circel " + this.getArea());
    }
}
