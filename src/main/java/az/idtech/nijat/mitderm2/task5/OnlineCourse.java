package az.idtech.nijat.mitderm2.task5;

public class OnlineCourse extends Course {

    private String platform;
    private int duration; // month

    public void showDetails() {
        System.out.println(this);
    }

    public boolean checkForCertificate() {
        return duration > 5;
    }

    @Override
    public String toString() {
        return "OnlineCourse{" +
                "super=" + super.toString() +
                ",platform='" + platform + '\'' +
                ", duration=" + duration +
                '}';
    }
}
