package advjavac1;

import java.util.List;
import java.util.ArrayList;

public class student {

    private String name;
    private int id;

    public student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        // Example usage
        List<student> students = new ArrayList<>();
        students.add(new student("Alice", 1));
        students.add(new student("Bob", 2));

        // Print all students
        for (student student : students) {
            System.out.println(student);
        }
    }
}
