package sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SelectionSortTest {
    SelectionSort selectionSort = new SelectionSort();

    @Test
    void testSelectionSort() {
        int[] result = selectionSort.selectionSort(new int[]{0, 5, 6, 1, 2, 7, 3});
        System.out.println(Arrays.toString(result));
        Assertions.assertArrayEquals(new int[]{0, 1, 2, 3, 5, 6, 7}, result);
    }

    @Test
    void testSelectionSort2() {
        int[] result = selectionSort.selectionSort(new int[]{0, 2, 1});
        System.out.println(Arrays.toString(result));
        Assertions.assertArrayEquals(new int[]{0, 1, 2}, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme