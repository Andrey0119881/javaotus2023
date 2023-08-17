import java.util.Arrays;
import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.lang.Integer;

public class TestSys {
    public static final Object[][][] QUESTIONS =
            {
                    {
                            {"Столица Франции?"},
                            {"Париж", "Лион", "Марсель"},
                            {1}
                    },
                    {
                            {"Самое большое млекопитающее на земле?"},
                            {"Слон", "Синий кит", "Жираф"},
                            {2}
                    },
                    {
                            {"Чему равно число ПИ?"},
                            {"≈3,18", "≈3,24", "≈3,14"},
                            {3}
                    },

            };

    public static String INPUT_MSG = "Введите  ответ:";

    public static String  START_MESSAGE = """
            Здраствуйте, перед Вами вопросы, на которые предлагается ответить!
            Для каждого вопроса возможен только один вариант ответа, для ответа введите значение
            и нажмите Enter.
            Внимание, в качестве ответов принимаются только цифры соответствующие ответу!!!
            """;
    public static String TRUE_MESSAGE = "Верный ответ!";
    public static String FALSE_MESSAGE = "Ответ неверный!";

    public static void main(String[] args) {
        int inputAnswer;
        int trueAnswer = 0;
        Scanner inputStr = new Scanner(System.in);
        System.out.println(START_MESSAGE);
        for (int i = 0; i < QUESTIONS.length; i++) {
            System.out.println("Вопрос № " + (i + 1) + " --> " + QUESTIONS[i][0][0] );
            for (int j = 0; j < QUESTIONS[i][1].length; j++) {
                System.out.println("  " + (j + 1) + ") " + QUESTIONS[i][1][j]);
            }
            System.out.println(INPUT_MSG);
            boolean trueAns = false;
            while (!trueAns) {
                    inputAnswer = inputStr.nextInt();
                    System.out.println("Номер ответа -" + inputAnswer);
                    if (inputAnswer != 0 && inputAnswer <= QUESTIONS[i][1].length) {
                        trueAns = true;
                        if (QUESTIONS[i][2][0].equals(inputAnswer)) {
                            System.out.println(TRUE_MESSAGE + "\n");
                            trueAnswer++;
                        } else System.out.println(FALSE_MESSAGE + "\n");
                    }
                }
        }
        System.out.println("Количество верных ответов" +  "\n" + trueAnswer + " из " + QUESTIONS.length);
    }
}
