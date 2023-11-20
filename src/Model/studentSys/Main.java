package Model.studentSys;

public class Main {
    public static void main(String[] args) {
        Sports student1 = new Sports("Alice", 1, 80, 70, 85, 20);
        Sports student2 = new Sports("Bob", 2, 90, 60, 65, 15);
        Sports student3 = new Sports("Charlie", 3, 50, 40, 55, 25);

        displayResult(student1);
        displayResult(student2);
        displayResult(student3);
    }

    public static void displayResult(Sports student) {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNo());
        System.out.println("Total Marks: " + student.getTotalMarks());
        System.out.println("Result: " + student.getResult());
        System.out.println("Sports Points: " + student.getSportsPoints());
        System.out.println();
    }
}