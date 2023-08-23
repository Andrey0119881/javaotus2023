package DZ8;

public class HomeWork {

    public static void main(String[] args) {
        TestDiceImpl diceImp = new TestDiceImpl();
        diceImp.testRoll();
        diceImp.testRollMass();
        TestGame TestGame = new TestGame();
        TestGame.testPlayGameOne();
        TestGame.testPlayGameTwo();
        TestGame.testPlayGameDraw();
    }
}