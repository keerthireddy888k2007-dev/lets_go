import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Keerthi");
        students.add("Rahul");
        students.add("Ananya");
        students.add("Ravi");

        System.out.println("Student List:");

        for (String student : students) {
            System.out.println(student);
        }
    }
}