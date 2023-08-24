package DZ8;

import DZ8.Game.DiceImpl;

public class TestDiceImpl {
    public void testRoll() {
        int diceI = new DiceImpl().roll();
        if (diceI < 1) {
            System.err.println("Выпало: " + diceI + ". Значение броска должно быть больше 0 ");
        } else {
            System.out.println("Проверка на попадание в  от 1 до 6 пройдена");
        }
        if (diceI > 6) {
            System.err.println("Выпало: " + diceI + ". Значение броска должно быть не более 6 ");
        } else {
            System.out.println("Проверка на попадание в интервал  от 1 до 6 пройдена");
        }
    }

    public void testRollMass() {
        boolean errorFound = false;
        int start = 1;
        int diceI = new DiceImpl().roll();
        while ((diceI > 0) & (diceI < 7) & (errorFound = false) & (start < 1000)) {
            start = start++;
            if (diceI < 1 || diceI > 6) {
                errorFound = true;
            }
        }
        if (errorFound = true) {
            System.err.println("Ошибка  тестирования на итерации " + start + ".Выпало: " + diceI + ". Значение броска должно быть в интервале от 1 до 6");
        } else {
            System.out.println("Проверка на попадание в интервал 1-6 пройдена");
        }
    }
}