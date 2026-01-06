package az.idtech.nijat.mitderm2.task3;

public class App {

    public static void main(String[] args) {
        Person person1 = new Person("Nijat", 21);
        Person person2 = new Person("Ramin", 25);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
    }
}
