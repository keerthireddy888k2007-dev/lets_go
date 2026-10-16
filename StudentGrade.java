public class StudentGrade {
    public static void main(String[] args) {

        String studentName = "Keerthi";
        int marks = 85;

        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks);

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}