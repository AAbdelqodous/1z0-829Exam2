package q15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("john", 25),
                new Student("lucy", 21),
                new Student("ivy", 23));

        Collections.sort(students, Student::compareByAge); // Given code sorts the list in ascending order of Student's age.
        System.out.println(students);
    }
}
