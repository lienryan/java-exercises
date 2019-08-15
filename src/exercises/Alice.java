package exercises;

import org.launchcode.java.demos.java4python.methods.Message;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String word;

        Scanner in = new Scanner(System.in);
        String story = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures " +
                "or conversation?";
        story = story.toLowerCase();

        System.out.println("Please enter a word you want to search: ");
        word = in.next();
        word = word.toLowerCase();

        boolean isInStory = story.contains(word);
        System.out.println(isInStory);

    }
}

