package sort;

import java.util.Arrays;

public class MergeSort {

    private int[] tempArray = null;

    public int[] mergeSort(int[] nums) {
        divide(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    private void divide(int[] nums, int left, int right) {
        tempArray = new int[nums.length];

        if (isCompletedSort(left, right)) {
            int middle = (left + right) / 2;
            divide(nums, left, middle);
            divide(nums, middle + 1, right);
            combine(nums, left, middle, right);
        }
    }

    private boolean isCompletedSort(int left, int right) {
        return left < right;
    }


    private void combine(int[] nums, int left, int middle, int right) {
        int inputIndex = left;
        int leftIndex = left;
        int rightIndex = middle + 1;

        // merge
        while (leftIndex <= middle && rightIndex <= right) {
            if (nums[leftIndex] <= nums[rightIndex])
                tempArray[inputIndex++] = nums[leftIndex++];
            else
                tempArray[inputIndex++] = nums[rightIndex++];
        }

        if (leftIndex > middle) {
            for (int i = rightIndex; i <= right; i++) {
                tempArray[inputIndex++] = nums[i];
            }
        } else {
            for (int i = leftIndex; i <= middle; i++) {
                tempArray[inputIndex++] = nums[i];
            }
        }

        if (right + 1 - left >= 0) System.arraycopy(tempArray, left, nums, left, right + 1 - left);
    }
}
