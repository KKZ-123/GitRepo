package com.example.main;

import com.example.model.Circle;
import com.example.model.Rectangle;
import com.example.model.Square;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShapeTest {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Rectangle[] rectangleArr = new Rectangle[100];
    static Square[] squareArr = new Square[100];
    static Circle[] circleArr = new Circle[100];

    public static void main(String[] args) throws IOException{

        getShpaeInfo(); 
        displayShapes();      
    }
    public static void displayCircle(){
        System.out.println("**************** Circle ********************");
        for(int i = 0; i < Circle.getCount(); i++){
            circleArr[i].display();
        }
    }
    public static void displayRectangle(){
        System.out.println("******************* Rectangle ****************");
        for(int i = 0; i < Rectangle.getCount(); i++){
            rectangleArr[i].display();
        }
    }
    public static void displaySquare(){
        System.out.println("***************** Square ****************");
        for(int i = 0; i < Square.getCount(); i++){
            squareArr[i].display();
        }

    }
    public static void displayShapes(){
        displayCircle();
        displayRectangle();
        displaySquare();
    }

    public static void getShpaeInfo() throws IOException{
        String flag;
        do{
            System.out.print("Enter Shape Type : ");
            String type = br.readLine();

            if(type.equalsIgnoreCase("rectangle")){

                rectangleArr[Rectangle.getCount()] = getRectangle();

            }else if(type.equalsIgnoreCase("circle")){

                circleArr[Circle.getCount()] = getCircle();

            }else if(type.equalsIgnoreCase("square")){

                squareArr[Square.getCount()] = getSquare();
            }
            System.out.print("Do you want to add new shape ? (yes/no) : ");
            flag = br.readLine();
        }while(flag.equalsIgnoreCase("yes"));

    }
    public static Square getSquare() throws IOException{
        System.out.print("Enter Square length : ");
        double length = Double.parseDouble(br.readLine());

        Square square = new Square(length);
        return square;
    }

    public static Circle getCircle() throws IOException{
        System.out.print("Enter Circle radius : ");
        double radius = Double.parseDouble(br.readLine());

        Circle circle = new Circle(radius);
        return circle;
    }

    public static Rectangle getRectangle() throws IOException{
        System.out.print("Enter Rectangle length : ");
        int length = Integer.parseInt(br.readLine());
        System.out.print("Enter Rectangle Width : ");
        int width = Integer.parseInt(br.readLine());

        Rectangle rectangle = new Rectangle(length, width);
        return rectangle;
    }

}
