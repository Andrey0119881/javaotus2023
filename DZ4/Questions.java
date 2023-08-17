package DZ4;

import java.util.Scanner;

class Questions {
    private String question;
    private String[] answer;
    private int trAnswer;
    public boolean flAnswer = false;

    public Questions(String question, String[] answer, int trAnswer) {
        this.question = question;
        this.answer = answer;
        this.trAnswer = trAnswer;
    }
    public int askQuestion(int number) {
        if (!flAnswer) prtQuestion(number);
        int inpAnswer;
        Scanner inputStr = new Scanner(System.in);
        System.out.println("Введите номер ответа:");
        inpAnswer = getAnw(inputStr);
        if (inpAnswer != -1) {
            System.out.println(inpAnswer);
            return inpAnswer;
        } else {
            System.err.println("Такого варианта ответа нет,введите номер ответа представленного на экране! " );
            return -1;
        }
    }
    private void prtQuestion(int i) {
        System.out.println("Вопрос № " + (i + 1) + "-->" + this.question);
        for (int j = 0; j < this.answer.length; j++) {
            System.out.println("  " + (j + 1) + ") " + this.answer[j]);
        }
    }
    private int getAnw(Scanner inputStr) {
        if (inputStr.hasNextInt()) {
            int n = inputStr.nextInt();
            if (n > 0 && n <= this.answer.length) {
                flAnswer = false;
                return n;
            } else {
                flAnswer = true;
                return -1;
            }
        } else {
            flAnswer = true;
            return -1;
        }
    }
    public int chkAnswer(int prAnswer) {
        if (prAnswer == this.trAnswer) {
            System.out.println("Верный ответ!\n");
            return 1;

        } else {
            System.out.println("Ответ не верный!\n");
            return 0;
        }
    }
}