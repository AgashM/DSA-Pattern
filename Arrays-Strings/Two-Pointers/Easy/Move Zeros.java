// Leetcode 283 Move Zeroes
// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zeroes. Note that you must do this in-place without making a copy of the array.

class MoveZeros {

    public static void main(String[] args) {
        System.out.println("Move Zeros");

        int[] arr = {0, 1, 0, 3, 12};
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j++] = temp;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
