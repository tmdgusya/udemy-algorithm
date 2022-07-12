package sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortTest {
    MergeSort mergeSort = new MergeSort();

    @Test
    void testMergeSort() {
        int[] result = mergeSort.mergeSort(new int[]{1, 5, 3, 7, 4, 6, 2, 9});
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 9}, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme