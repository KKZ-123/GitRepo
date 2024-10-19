package com.example.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.example.model.Rectangle;
import com.example.model.Square;
import com.example.model.Circle;

public class ShapeTest {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Rectangle[] rectangleArr = new Rectangle[100];
    static Square[] squareArr = new Square[100];
    static Circle[] circleArr = new Circle[100];

    public static void main(String[] args) throws IOException{

        String flag;
        do{
            System.out.print("Enter Shape Type : ");
            String type = br.readLine();

            if(type.equalsIgnoreCase("rectangle")){
                System.out.print("Enter Rectangle length : ");
                int length = Integer.parseInt(br.readLine());
                System.out.print("Enter Rectangle Width : ");
                int width = Integer.parseInt(br.readLine());

                Rectangle rectangle = new Rectangle(length, width);
                rectangleArr[Rectangle.getCount() - 1] = rectangle;

            }else if(type.equalsIgnoreCase("circle")){
                System.out.print("Enter Circle radius : ");
                double radius = Double.parseDouble(br.readLine());

                Circle circle = new Circle(radius);
                circleArr[Circle.getCount() - 1] = circle;

            }else if(type.equalsIgnoreCase("square")){
                System.out.print("Enter Square length : ");
                double length = Double.parseDouble(br.readLine());

                Square square = new Square(length);
                squareArr[Square.getCount() - 1] = square;
            }
            System.out.print("Do you want to add new shape ? (yes/no) : ");
            flag = br.readLine();
        }while(flag.equalsIgnoreCase("yes"));

        System.out.println("******************* Rectangle ****************");
        for(int i = 0; i < Rectangle.getCount(); i++){
            rectangleArr[i].display();
        }

        System.out.println("**************** Circle ********************");
        for(int i = 0; i < Circle.getCount(); i++){
            circleArr[i].display();
        }

        System.out.println("***************** Square ****************");
        for(int i = 0; i < Square.getCount(); i++){
            squareArr[i].display();
        }
    }

}
