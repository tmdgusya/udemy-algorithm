package sort;

public class SelectionSort {

    public int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            int min = array[i];
            for (int j = i; j < array.length; j++) {
                if(min > array[j]) {
                    min = array[j];
                    minIndex = j;
                }
            }
            swap(array, i, minIndex, min);
        }
        return array;
    }

    private void swap(int[] array, int i, int minIndex, int min) {
        int tmp = array[i];
        array[i] = min;
        array[minIndex] = tmp;
    }

}
