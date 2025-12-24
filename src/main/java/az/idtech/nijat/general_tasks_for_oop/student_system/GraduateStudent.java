package az.idtech.nijat.general_tasks_for_oop.student_system;

public class GraduateStudent extends Student{

    @Override
    public double getFinalGrade() {
        return super.getFinalGrade() + 10.0;
    }
}
