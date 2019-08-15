package exercises;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class IdHashMap {
    public static void main(String [] args) {
        HashMap<String, Integer> names = new HashMap<>();
        Scanner in = new Scanner(System.in);

        String newName;

        System.out.println("Enter your student ID (or ENTER to finish): ");

        // Get ID numbers and student names

        do {
            System.out.print("Name: ");
            newName = in.nextLine();
            if (!newName.equals("")) {
                System.out.print("Student ID: ");
                int newID = in.nextInt();
                names.put(newName, newID);

                //Read in the newline before loping back in.nextLine();
                in.nextLine();
            }

        } while(!newName.equals(""));


        //Print class roster

        System.out.println("\n\nClass roster:");

        for (Map.Entry<String,Integer> name: names.entrySet()) {
            System.out.println(name.getKey()+ " : " + name.getValue() );
        }
    }
}
