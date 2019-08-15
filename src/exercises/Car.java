package exercises;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        float miles ;
        float gas;
        float milesPerGallon;

        Scanner in = new Scanner(System.in);
        System.out.println("How many miles have you driven? ");
        miles = in.nextFloat();
        System.out.println("The amount of gas you've consumed(in gallons)? ");
        gas = in.nextFloat();

        milesPerGallon = miles / gas ;
        System.out.println("Your miles-per-gallon is: " + milesPerGallon + " mpg");
    }

}
