package exercises;

import java.util.Scanner;
import java.util.ArrayList;

public class Sum {
    public static void main(String[] args) {
        Integer sum = 0;

        int[] someNumbers = {1,2,3,4,5,6,7,8,9,10};
        for (int i: someNumbers) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of all even numbers is " + sum);
    }
}

