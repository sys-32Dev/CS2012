import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class D_ReadFileStats {
    public static void main(String[] args) {
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name/path: ");
        String fileName = sc.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                String[] words = line.split("\\s+");

                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
            e.printStackTrace();
        }

        System.out.println("Number of Characters:" + charCount);
        System.out.println("Number of Words:" + wordCount);
        System.out.println("Number of Lines:" + lineCount);
    }
}
