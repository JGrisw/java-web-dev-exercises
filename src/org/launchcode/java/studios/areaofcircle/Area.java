package org.launchcode.java.studios.areaofcircle;
import java.util.Scanner;

import static org.launchcode.java.studios.areaofcircle.Circle.*;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        do {
            System.out.println("Enter a radius:");
            while(!input.hasNextDouble()){
                System.out.println("input a number Bucko");
                input.next();
            }
            radius = input.nextDouble();
                if (radius > 0.0 ) {
                    Double area = getArea(radius);
                    System.out.println("The area of a circle of radius " + radius + " is: " + area);
                } else {
                    System.out.println("You must enter a positive number sir");
                }
        } while ( radius <= 0.0);
    }
}
