package exercises;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        float width ;
        float length ;
        float area;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the width (inches) of the rectangle: ");
        width = in.nextFloat();
        System.out.println("Enter the length (inches) of the rectangle: ");

        length = in.nextFloat();

        area = width * length ;
        System.out.println("The area of the rectangle with width= "+width+" inches and length= "+length+ " inches is: "+ area + " Square Inches");

    }

}
