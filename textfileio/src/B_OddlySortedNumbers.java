import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class B_OddlySortedNumbers {
    public static void main(String[] args) {
        // declares file paths
        // WARNING: THESE FILE PATHS ARE FOR LINUX, PLEASE CHANGE TO APPROPRIATE PATH IF RUNNING ON WINDOWS
        // OR THE PROGRAM MAY NOT RUN.
        String inputFileName = "/home/system32/IdeaProjects/CS2012/textfileio/src/randomNumbers.txt";
        String outputFileName = "/home/system32/IdeaProjects/CS2012/textfileio/src/oddSortedNumbers.txt";
        // Creates new Variable array named numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        // Tries to read the file specified in var inputFileName
        try (BufferedReader reader = new BufferedReader(new FileReader((inputFileName)))) {
            String line = null;
            // adds numbers from file to variable array numbers
            while ((line = reader.readLine()) != null) {
                numbers.add(Integer.parseInt(line.trim()));
            }
        } catch (IOException e) {
            // catches exceptions and prints them
            System.out.println("Error reading file");
            e.printStackTrace();
            return;
        }
        // Sorts the numbers based on the output of the method compare();
        Collections.sort(numbers, new Comparator<Integer>()  {
            // Takes 2 Integers from the Array, invokes the private method reverseNumber(), and compares the 2 numbers.
            public int compare(Integer num1, Integer num2) {
                int reversed1 = reverseNumber(num1);
                int reversed2 = reverseNumber(num2);
                return Integer.compare(reversed1, reversed2);
            }
        });

        try (FileWriter writer = new FileWriter(outputFileName)) {
            for (Integer number : numbers) {
                writer.write(number + "\n");
            }
            System.out.println("Sorted numbers written to file" + outputFileName);
        } catch (IOException e) {
            System.out.println("Error writing file");
            e.printStackTrace();
        }
    }
    private static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
