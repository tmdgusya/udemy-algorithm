package sort;

public class QuickSort {

    public void quickSort(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    private void sort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivotIndex = partition(nums, left, right);

        sort(nums, left, pivotIndex - 1);
        sort(nums, pivotIndex + 1, right);
    }

    // [7, 2, 5, 1, 3, 8, 7, 4, 9, 6]
    private int partition(int[] nums, int left, int right) {
        int pivot = nums[right];

        int leftIndex = left;
        for (int i = left; i < right; ++i) {
            if (nums[i] < pivot) {
                swap(nums, leftIndex, i);
                ++leftIndex;
            }
        }

        int pivotIndex = leftIndex;
        swap(nums, pivotIndex, right);

        return pivotIndex;
    }

    private void swap(int[] nums, int left, int leftIndex) {
        int tmp = nums[leftIndex];
        nums[leftIndex] = nums[left];
        nums[left] = tmp;
    }

}
