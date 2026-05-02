// leetcode 167 Two Sum II - Input Array Is Sorted
// Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

class TwoSumII {

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("[" + ++left + "," + ++right + "]");
                return;
            }
            if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
    }
}
