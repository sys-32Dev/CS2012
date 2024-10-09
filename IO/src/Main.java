import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        // creates new array list, with "Student" as the objects in the list
        List<Student> students = new ArrayList<>();
        // sets the location of the txt file list
        String inputFile = "/home/system32/IdeaProjects/CS2012/IO/src/students.txt";
        // tries reading the file, splits the file by the comma, and stores it in the "students" list
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                String name = tokens[0];
                double grade = Double.parseDouble(tokens[1]);
                students.add(new Student(name, grade));
            }
        } catch (IOException e) {
            System.out.println("Error reading file:" + e.getMessage());
        } // If there is an error in the file, catches the error, displays it, and moves on

        System.out.println("students in file:");
        for (Student s : students) {
            System.out.println(s);
        } // prints out students in file
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter grade: ");
        double grade = scanner.nextDouble();
        students.add(new Student(name, grade));
        // Asks for user input to add new student to the list

        String outputFile = "/home/system32/IdeaProjects/CS2012/IO/src/updatedStudents.txt";
        // sets output location
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            for (Student s : students) {
                bw.write(s.toString());
                bw.newLine();
            } // Tries to write the Student to the file by converting it into a string via the toString() method
        } catch (IOException e) {
            System.out.println("Error writing file:" + e.getMessage());
        } // Catches error, see above explanation.
        System.out.println("Updated Students in file");
        // Display Success Message if user succedes.
    }
}