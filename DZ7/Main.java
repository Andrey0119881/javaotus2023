package DZ7;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Throwable {
        Integer a = 0;
        boolean TrueInt = false;

        Scanner inputStr = new Scanner(System.in);
        InputError inputError = new InputError();

        System.out.println("Проверяем ввод данных ");

        while (!TrueInt) {
            System.out.println("Введите число:");
            TrueInt = inputError.intNumber(inputStr.nextLine());
            if (TrueInt) {
                a = inputError.getIntValue();
                System.out.println(a);
            }
        }

        System.out.println("Проверяем   try-with-resources");
        String fileName1 = new File("DZ7/File.txt").getAbsolutePath();
        String fileName2 = new File("DZ7/File1.txt").getAbsolutePath();
        String fileName3 = new File("DZ7/File2.txt").getAbsolutePath();
        ReadFile readFile = new ReadFile();

        readFile.readFile(fileName1);
        readFile.readFile(fileName2);
        readFile.readFile(fileName3);


        System.out.println("Проверяем перехват исключения");

        RethrowException rethrowException = new RethrowException();
        rethrowException.rethrowException();



    }
}