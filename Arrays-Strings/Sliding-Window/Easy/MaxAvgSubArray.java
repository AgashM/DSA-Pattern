// Leetcode 643. Maximum Average Subarray I
// You are given an integer array nums consisting of n elements, and an integer k.

class MaxAvgSubArray {

    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        double res = (double) windowSum / k;
        int idx = 0;
        for (int j = k; j < arr.length; j++) {
            windowSum = windowSum + arr[j] - arr[idx];
            idx++;
            res = Math.max(res, (double) windowSum / k);
        }
        System.out.println(res);
    }
}
