package DZ7;

public class RethrowException {
    public static void rethrowException() throws Throwable {

        try {
            getTwo();
        } catch (Exception e) {
            System.out.println("Поймали исключение из getTwo(), которое поймали из getOne(): " + e);
        }
    }
    public static void getOne() throws Exception {
        System.out.println("Создадим исключение");
        throw new Exception("Исключение в getOne()");
    }
    public static void getTwo() throws Throwable {
        try {
            getOne();
        } catch (Exception e) {
            System.out.println("Поймали исключение из getOne(): " + e);
            throw e;
        }
    }
}