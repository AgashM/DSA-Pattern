// Leetcode 344 Reverse String
// Write a function that reverses a string. The input string is given as an array of characters s. You must do this by modifying the input array in-place with O(1) extra memory.

class ReverseString {

    public static void main(String[] args) {
        String s = "Adeiu";
        char[] str = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char c = str[right];
            str[right] = str[left];
            str[left] = c;

            left++;
            right--;
        }
        System.out.println(str);
    }
}
