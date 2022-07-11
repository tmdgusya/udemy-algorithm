package sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuickSortTest {
    QuickSort quickSort = new QuickSort();

    @Test
    void testQuickSort() {
        // given
        var nums = new int[]{7, 2, 5, 1, 3, 8, 7, 4, 9, 6};

        // when
        quickSort.quickSort(nums);

        // then
        Assertions.assertEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 7, 8, 9}, nums);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme