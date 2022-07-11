package sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class BubbleSortTest {
    BubbleSort bubbleSort = new BubbleSort();

    @Test
    void testBubbleSort() {
        int[] result = bubbleSort.bubbleSort(new int[]{8, 4, 3, 6, 7, 9, 0, 1});

        Assertions.assertArrayEquals(new int[]{0, 1, 3, 4, 6, 7, 8, 9}, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme