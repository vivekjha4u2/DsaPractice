package org.example.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortCharsByFreq {
    public static void main(String[] args) {
        String s = sortchars("tree");
        System.out.println(s);
    }

    public static String sortchars(String s) {
        StringBuilder res = new StringBuilder();
        Map<Character, Long> freq =
                s.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        List<Character> chars = new ArrayList<>(freq.keySet());
        Collections.sort(chars, (c1,c2)-> (int) (freq.get(c2)-freq.get(c1)));

        for (Character c : chars) {
            long count = freq.get(c);
            while (count != 0) {
                res.append(c);
                count--;
            }
        }
        return res.toString();
    }
}
