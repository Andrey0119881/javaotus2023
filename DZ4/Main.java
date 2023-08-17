package DZ4;

public class Main {
    public static void main(String[] args) {
        Questions questions1 = new Questions("Столица Франции?", new String[]{"Париж", "Лион", "Марсель"}, 1);
        Questions questions2 = new Questions("Самое большое млекопитающее на земле?", new String[]{"Слон", "Синий кит", "Жираф"}, 2);
        Questions questions3 = new Questions("Чему равно число ПИ?", new String[]{"≈3,18", "≈3,24", "≈3,14"}, 3);
        Test run = new Test(new Questions[]{questions1, questions2, questions3});
        run.Test();
    }
}