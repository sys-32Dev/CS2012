import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class A_WriteRandomNumbers {
    public static void main(String[] args) {
        // Declare Variables
        // WARNING: THESE FILE PATHS ARE FOR LINUX, PLEASE CHANGE TO APPROPRIATE PATH IF RUNNING ON WINDOWS
        // OR THE PROGRAM MAY NOT RUN.
        String filename = "/home/system32/IdeaProjects/CS2012/textfileio/src/randomNumbers.txt";
        int numberOfRandomNumbers = 100;
        int lowerBound = 1000;
        int upperBound = 9999;
        // Tries Writing to File
        try(FileWriter writer = new FileWriter(filename)) {
            // sets var rand to new random number
            Random rand = new Random();
            // for the # in var numberOfRandomNumbers generate a random number within the bounds of the vars specified above
            for (int i = 0; i < numberOfRandomNumbers; i++) {
                int randomNumber = rand.nextInt(upperBound - lowerBound) + lowerBound;
                // Writes ths number
                writer.write(randomNumber + "\n");
            }
            // Informs user that the write was successful
            System.out.println("Random numbers written to " + filename);
            // Catches exception and informs user of the exception and its nature
        } catch (IOException e) {
            System.out.println("Error while writing to file " + filename);
            e.printStackTrace();

        }
    }
}
