// Leetcode 26 Remove Duplicates from Sorted Array
// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

class RemoveDupSortedArray {

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 1, 2, 2, 3, 4, 5, 5, 6, 6, 6, 7, 7, 8, 9, 10};

        int left = 1;

        for (int right = 1; right < arr.length; right++) {
            if (arr[right] != arr[right - 1]) {
                arr[left] = arr[right];
                left++;
            }
        }
        System.out.println(left);
    }
}
