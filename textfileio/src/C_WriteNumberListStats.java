import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class C_WriteNumberListStats {
    public static void main(String[] args) {
        String inputFileName = "/home/system32/IdeaProjects/CS2012/textfileio/src/randomNumbers.txt";
        String outputFileName = "/home/system32/IdeaProjects/CS2012/textfileio/src/numberListStats.txt";
        int grandTotal = 0;
        int totalFirstDigit = 0;
        int totalSecondDigit = 0;
        int totalThirdDigit = 0;
        int totalFourthDigit = 0;
        int countOf17= 0;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                grandTotal += number;
                count++;

                int firstDigit = number / 1000;
                int secondDigit = (number / 100) % 10;
                int thirdDigit = (number / 10) % 10;
                int fourthDigit = number % 10;

                totalFirstDigit += firstDigit;
                totalSecondDigit += secondDigit;
                totalThirdDigit += thirdDigit;
                totalFourthDigit += fourthDigit;

                if(number == 17){
                    countOf17++;
                }
            }

        } catch (IOException e) {
            System.out.println(" Error reading " + inputFileName);
            e.printStackTrace();
            return;
        }
        double average = (count > 0) ? grandTotal / count : 0;

        try (FileWriter writer = new FileWriter(outputFileName)) {
            writer.write( "Grand Total = " + grandTotal + "\n");
            writer.write("1st column = " + totalFirstDigit + "\n");
            writer.write("2nd column = " + totalSecondDigit + "\n");
            writer.write("3rd column = " + totalThirdDigit + "\n");
            writer.write("4th column = " + totalFourthDigit + "\n");
            writer.write("average = " + (int) average + "\n");
            writer.write("count of 17's = " + countOf17 + "\n");
            System.out.println( outputFileName  + "Has bee written to.");
        } catch (IOException e) {
            System.out.println(" Error writing " + outputFileName);
            e.printStackTrace();
        }

    }
}
