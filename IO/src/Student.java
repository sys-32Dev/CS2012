public class Student {
    // Sets 2 private varibles
    private String name;
    private double grade;
    // method of setting given values as varibles
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
    // setters and getters for each variable
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    // returns the varibles as strings
    public String toString() {
        return name + "," + grade;
    }
}
