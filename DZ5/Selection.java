package DZ5;

public class Selection {
    public static void sortout(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pMin = i;
            int minEll = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minEll) {
                    pMin = j;
                    minEll = array[j];
                }
            }
            array[pMin] = array[i];
            array[i] = minEll;
        }
    }

}
