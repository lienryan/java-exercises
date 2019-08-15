package exercises;

import java.util.ArrayList;

public class FiveLetters {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Beach");
        wordList.add("Water");
        wordList.add("Free");
        wordList.add("Bread");
        wordList.add("Java");
        wordList.add("Coffee");
        wordList.add("Sleep");
        wordList.add("Kevin");

        printFive(wordList);

    }

    public static void printFive(ArrayList<String> alist) {
        //loop through and get each word
        for (String word : alist) {
            //check size of each word, if exactly 5 then print
            if (word.length() == 5 ) {
                System.out.println(word);
            }
        }

        System.out.println();
    }

}
