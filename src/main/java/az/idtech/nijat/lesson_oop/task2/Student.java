package az.idtech.nijat.lesson_oop.task2;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.printf("""
                Name: %s
                Age: %d
                """,
                name,
                age);
    }
}
