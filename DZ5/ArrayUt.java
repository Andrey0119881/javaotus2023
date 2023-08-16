package DZ5;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class ArrayUt {
    private int[] array;
    private int El;
    private int minEl;
    private int maxEl;

    public ArrayUt(int[] array, int El, int minEl, int maxEl) {
        this.array = array;
        this.El = El;
        this.minEl = minEl;
        this.maxEl = maxEl;
    }

    private static int[] addElements(int[] array, int elementToAdd) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) newArray[i] = array[i];
        newArray[newArray.length - 1] = elementToAdd;
        return newArray;
    }

    public int[] createArray() {
        for (int i = 1; i <= this.El; i++)
            this.array = addElements(this.array, (int) (Math.random() * (this.maxEl - this.minEl)) + this.minEl);
        return this.array;
    }
    public int[] getArray(){
        return this.array;
    }

    public List<Integer> getListArray(int[] intArray) {
        List<Integer> newList = new ArrayList<Integer>(intArray.length);
        for (int i : intArray) newList.add(i);
        return newList;
    }

    public long getTimeSort(long timeStart) {
        return System.currentTimeMillis() - timeStart;

    }
}