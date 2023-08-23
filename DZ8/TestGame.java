package DZ8;

import DZ8.Game.*;

public class TestGame {
    private static String ONE = "Вася";
    private static String TWO = "Игорь";

    public void testPlayGameOne() {
        Dice dice = new Dice() {
            int count = 0;

            @Override
            public int roll() {
                count++;
                if (count == 1) {
                    return 6;
                } else {
                    return 1;
                }
            }
        };
        GameWinnerPrinter winnerPrinter = new GameWinnerPrinter() {
            @Override
            public void printWinner(Player winner) {
                String x = winner.getName();
                if (x.equals(ONE)) {
                    System.out.printf("Победитель: %s%n", ONE);
                } else {
                    System.err.println("Ошибка ! Неверное имя победителя " + ONE + " " + x);
                }
            }
        };
        Game game = new Game(dice, winnerPrinter);
        System.out.println("Если победил первый игрок, то должно печататься имя " + ONE);
        game.playGame(new Player(ONE), new Player(TWO));
    }


    public void testPlayGameTwo() {
        Dice dice = new Dice() {
            int count = 0;

            @Override
            public int roll() {
                count++;
                if (count == 1) {
                    return 1;
                } else {
                    return 6;
                }
            }
        };
        GameWinnerPrinter winnerPrinter = new GameWinnerPrinter() {
            @Override
            public void printWinner(Player winner) {
                String x = winner.getName();
                if (TWO.equals(x)) {
                    System.out.printf("Победитель: %s%n", x);
                } else {
                    System.err.println("Ошибка ! Неверное имя победителя " + TWO + " " + x);
                }
            }
        };
        Game game = new Game(dice, winnerPrinter);
        System.out.println("Если победил второй игрок , то должно печататься имя " + TWO);
        game.playGame(new Player(ONE), new Player(TWO));
    }


    public void testPlayGameDraw() {
        Dice dice = new Dice() {
            @Override
            public int roll() {
                {
                    return 1;
                }
            }
        };
        GameWinnerPrinter winnerPrinter = new GameWinnerPrinter() {
            @Override
            public void printWinner(Player winner) {
                String x = winner.getName();
                if (TWO.equals(x) || ONE.equals(x)) {
                    System.err.printf("Ошибка в сообщении должно быть -->'Ничья' - Победитель: %s%n", x);
                } else {
                    System.out.println("Ничья");
                }
            }
        };
        Game game = new Game(dice, winnerPrinter);
        System.out.println("Если количество очков одинаково, то должно печататься Ничья");
        game.playGame(new Player(ONE), new Player(TWO));
    }
}