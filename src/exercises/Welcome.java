package exercises;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        String name;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = in.next();

        System.out.println("Welcome, " + name + "!");
    }
}
