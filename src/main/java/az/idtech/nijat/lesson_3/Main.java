package az.idtech.nijat.lesson_3;

public class Main {
    public static void main(String[] args) {
        float fl = 19.99f;
        char ch = 'A';
        boolean isStudent = true;
        System.out.printf("float fl = %f%n",fl);
        System.out.printf("char ch = %c%n", ch);
        System.out.printf("boolean isStudent = %b",isStudent);

        byte byt = 100;
        short sh = 32000;
        int integer =   100_000;
        long lng = 123456789L;
        float fl2 = 45.75f;
        double dbl =  100.3456;

        System.out.println(byt + sh);
        System.out.println(integer * lng);
        System.out.println(fl2 / dbl);

        String fullName = "Aliyev Nijat";
        System.out.println(fullName);

        double dbl2 = 24.25;
        int cst = (int) dbl2;
        System.out.printf("Original: %f", dbl2);
        System.out.printf("Casted: %d", cst);

        char ch2 = 'N';
        int ascii = (int) ch2;
        System.out.println(ch2);
        System.out.println(ascii);
        boolean isAdult = true;
        boolean hasDrivingLicense = false;
        System.out.println(isAdult);
        System.out.println(hasDrivingLicense);
    }
}
