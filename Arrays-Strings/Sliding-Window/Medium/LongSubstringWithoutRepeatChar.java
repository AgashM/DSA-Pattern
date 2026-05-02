// Letcode 3. Longest Substring Without Repeating Characters
// Given a string s, find the length of the longest substring without repeating characters. 

import java.util.*;

class LongSubstringWithoutRepeatChar {

    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxSum = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        for (char right = 0; right < s.length(); right++) {
            char ch = s.charAt(right); // a b c b a c
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxSum = Math.max(maxSum, right - left + 1);
        }
        System.out.println(maxSum);
    }
}
