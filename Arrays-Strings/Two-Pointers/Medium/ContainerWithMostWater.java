// Leetcode 11 Container With Most Water
// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int left = 0;
        int right = arr.length - 1;
        int max = 0;
        while (left < right) {
            int height = Math.min(arr[left], arr[right]);
            int length = right - left;

            max = Math.max(max, height * length);

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(max);

    }
}
