package exercises;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class GradeBookHashMap {
    public static void main(String [] args) {
        HashMap<Integer, String> idNumbers = new HashMap<>();
        Scanner in = new Scanner(System.in);

        int newID;

        System.out.println("Enter your student ID (or enter 0 to finish): ");

        // Get ID numbers and student names

        do {
            System.out.print("ID number: ");
            newID =  Integer.valueOf(in.nextLine());
            if (newID != 0) {
                System.out.print("Student: ");
                String newStudent = in.nextLine();
                idNumbers.put(newID, newStudent);

                //Read in the newline before loping back in.nextLine();


            }

        } while(newID !=0 );
        in.close();

        //Print class roster

        System.out.println("\n\nClass roster:");

        for (Map.Entry<Integer,String> idNumber: idNumbers.entrySet()) {
            System.out.println(idNumber.getKey() + " : " + idNumber.getValue());

        }
    }
}