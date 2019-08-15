import java.util.ArrayList;

public class ArraylistProgram {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(1);
        listOfNumbers.add(10);
        listOfNumbers.add(27);
        listOfNumbers.add(3);
        listOfNumbers.add(16);
        listOfNumbers.add(4);
        listOfNumbers.add(7);
        listOfNumbers.add(9);
        listOfNumbers.add(223);

        //call the method
        int sumOfList = sumOfEven(listOfNumbers);
        // return what the method gives us
        System.out.println(sumOfList);

    }

    public static int sumOfEven(ArrayList<Integer> alist) {
        int sum = 0;

        for (Integer number : alist) {
            if (number % 2 == 0) {
                sum += number;
            }

        }
        return sum;
    }
}
