package tp_java;
public class TestStudent {

    public static void main(String[] args) {

        Student student = new Student("mouad", 20, 12.5);

        System.out.println(student);

        System.out.println("Passed: " + student.isPassed());
    }
}