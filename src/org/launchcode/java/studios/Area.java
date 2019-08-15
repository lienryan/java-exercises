package org.launchcode.java.studios;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;


        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a radius: ");

        do {
            radius = in.nextDouble();

            if (radius <= 0) {
                System.out.println("Please enter a radius greater than 0");
                System.out.println("Please enter a radius: ");
            }
        } while (radius <= 0);

        area = 3.14 * radius * radius;
        System.out.println("The area of a circle with a radius of " + radius + " is: "+ area);

    }
}
