package q15;

public record Student(String name, int age) {
    public String toString(){
        return "q15.Student (" +name+ ", " +age+ ")";
    }
    public static int compareByAge(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}
