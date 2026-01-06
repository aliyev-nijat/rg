package az.idtech.nijat.mitderm2.task5;

public class Course {

    private String name;
    private String instructor;
    private int credits;


    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", instructor='" + instructor + '\'' +
                ", credits=" + credits +
                '}';
    }
}
