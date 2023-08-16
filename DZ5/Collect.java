package DZ5;

import java.util.Arrays;
import java.util.Collections;

public class Collect {
    public static void main(String[] args) {

        long startTime = 0;
        long endTime = 0;
        ArrayUt myArray = new ArrayUt(new int[]{0}, 100000, -73452, 91675);
        int[] randomArray = myArray.createArray();
        int[] randomArray1 = Arrays.copyOf(randomArray, randomArray.length);

        System.out.print(Arrays.toString(randomArray) + "\n"+ "\n");
        startTime = System.currentTimeMillis();
        Selection.sortout(randomArray);
        endTime = myArray.getTimeSort(startTime);
        System.out.println("Cортировка выбором занимает --> " + endTime + " мс");

        startTime = System.currentTimeMillis();
        Collections.sort(myArray.getListArray(randomArray1));
        endTime = myArray.getTimeSort(startTime);
        System.out.println("Сортировка коллекции занимает --> " + endTime + " мс");
    }
}

