
class TrappingRainWater {

    public static void main(String[] args) {
        int[] arr = {3, 0, 2, 0, 4};
        int length = arr.length - 1;

        int left = 0;
        int right = length;
        int leftmax = 0;
        int rightmax = 0;
        int trap = 0;

        while (left < right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] >= leftmax) {
                    leftmax = arr[left];
                } else {
                    trap += leftmax - arr[left];
                }
                left++;
            } else {
                if (arr[right] >= rightmax) {
                    rightmax = arr[right];
                } else {
                    trap += rightmax - arr[right];
                }
                right--;
            }
        }
        System.out.println(trap);
    }
}
