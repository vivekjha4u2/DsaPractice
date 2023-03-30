package org.example.String;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
//        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        String [] strs = new String[]{"bdddddddddd","bbbbbbbbbbc"};
        List<List<String>> res= ga.groupAnagrams2(strs);
        for (List<String> l: res){
            for (String s: l){
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }

    //O(N KLogK) sorting all strings
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length==0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            char [] chrs = str.toCharArray();
            Arrays.sort(chrs);
            String temp = String.valueOf(chrs);
            if(map.containsKey(temp)){
                map.get(temp).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(temp, list);
            }
        }

        return new ArrayList<>(map.values());
    }

    //O(N K)
    public List<List<String>> groupAnagrams2(String[] strs) {
        if(strs == null || strs.length==0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            int[] freq = new int[26];
            for(char c: str.toCharArray()) {
                freq[c-'a']++;
            }
            String temp = "";
            //do this if freq arr is of integer, dividing each integer with any char ex- "a", so that
            // in case of bbbbbbbbbbc, bdddddddddd 0101000, keys are same.. 1 0 and 10 cant be differentiated otherwise
            for(int i=0;i< freq.length;i++) temp+=freq[i]+"a";

            if(map.containsKey(temp)){
                map.get(temp).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(temp, list);
            }
        }

        return new ArrayList<>(map.values());
    }

    public List<List<String>> groupAnagrams3(String[] strs) {
        if(strs == null || strs.length==0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            /****
             if we use char [] for freq, it will store unicode
             char[] freq = new char [26];
             freq[c-'a']++;
             String temp = String.valueOf(freq);
             ****/
            char[] freq = new char [26];
            for(char c: str.toCharArray()) {
                freq[c-'a']++;
            }
            String temp = String.valueOf(freq);

            if(map.containsKey(temp)){
                map.get(temp).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(temp, list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
