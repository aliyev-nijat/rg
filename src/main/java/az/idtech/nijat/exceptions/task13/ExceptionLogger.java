package az.idtech.nijat.exceptions.task13;

public class ExceptionLogger {

    public static void logException(Exception ex) {
        System.out.printf("""
                        Message: %s
                        Cause: %s""",
                ex.getMessage(),
                ex.getCause()
        );
        ex.printStackTrace();
    }
}
