package DZ4;

public class Test {
    private final Questions[] question;
    public Test (Questions[] question) {
        this.question = question;
    }
    public void Test() {
        int TrueAnswer = 0;
        for (int i = 0; i < question.length; i++) {
            int result = question[i].askQuestion(i);
            while (result == -1)
                result = question[i].askQuestion(i);
            if (result != -1) TrueAnswer += question[i].chkAnswer(result);
        }
        getRes(TrueAnswer, question.length);
    }
    public void getRes(int result, int cntQuest) {
        System.out.println("Количество правильных ответов: " + result + " из " + cntQuest);
    }
}