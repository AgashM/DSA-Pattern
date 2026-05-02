// Letcode 763. Partition Labels
// A string S of lowercase letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts. []l

import java.util.*;

class PartitionLabel {

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a'] = i;
        }

        int start = 0;
        int end = 0;
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < s.length(); j++) {
            end = Math.max(end, freq[s.charAt(j) - 'a']);

            if (j == end) {
                list.add(end - start + 1);
                start = j + 1;
            }
        }
        System.out.println(list);

    }
}
