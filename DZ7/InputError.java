package DZ7;

public class InputError {
    private Integer intValue;

    public InputError() {
    }

    public Integer getIntValue() {
        return this.intValue;
    }

    public boolean intNumber(String number) {
        try {
            if (number.equals("")) {
                throw new NullPointerException("Не задано значение");
            }
            this.intValue = new Integer(number);
            return true;

        } catch (NullPointerException | NumberFormatException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}