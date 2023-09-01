package org.example.random;

import java.util.*;
/*
Sequential String -- PAYPAL - OA
A special string s of length n consists of characters 0-9 only.
Its characters can only be accessed sequentially i.e the first '1' chosen is the leftmost '1' in s.
There is an array arrof m strings, also consisting of characters 0-9

Calculate the minimum number of characters needed from s to construct a permutation of each of the strings in arr. ALL 2 Return an array of integers where the th element denotes the minimum length of a substring that contains a permutation of the fh string in arr.

If a string cannot be constructed return -1 at that index Example Consider n= 12, s= "064819848398", m= 3, arr = ["088", "364", "07"]

To construct "088", Alice needs to access the first 7 characters ("064819848398") of the special string and use only '0', '8, and '8',
Since the characters can be rearranged, the results for '088', '808', and '880' are all 7.
To construct "364", access the first 10 characters ("064819848398") of the special string and use
To construct "088", Alice needs to access the first 7 characters ("064819848398") of the special string and use only '0, '8, and '8'.
Since the characters can be rearranged, the results for '088. '808', and '880' are all 7.

To construct "364", access the first 10 characters ("064819848398") of the special string and use only '6, '4', and '3'.
Rearrange to match "364" String "07" cannot be constructed from the special string.
No '7' is available ALL 2 The return array is [7, 10, -1].

Note that only bolded characters are used to construct the strings Function Description
Complete the function countMinimum Characters in the editor below.
countMinimumCharacters has the following parameters: string s: the special string of length n string arrlm]:
strings to construct Returns int[].: the th element corresponds to the minimum number of characters required

 */
public class Trial2 {
    public static void main(String[] args) {
//        List<Integer> ans1 =  countMinimumCharacters("111222333444", Arrays.asList("121", "3", "12345", "11234"));
        List<Integer> ans =  countMinimumCharacters("01234567894114536319", Arrays.asList("1869447121",
                "2312738",
                "6217381515633",
                "8169917623",
                "916112596508"));
        for (int a: ans){
            System.out.print(a+" ");
        }
    }

    public static List<Integer> countMinimumCharacters(String s, List<String> arr) {
        // Write your code here

        int n = s.length();
        int m = arr.size();
        List<Integer> ans = new ArrayList<>();
        Map<Character, List<Integer>> map = new HashMap<>();
        for(int i=0; i<n; i++){
            char chr = s.charAt(i);
            if(!map.containsKey(chr)){
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(chr, list);
            }else{
                map.get(chr).add(i);
            }
        }


        for(String str: arr){

            Map<Integer, Boolean> visited = new HashMap<>();
            int maxIndex = -1;
            for(char chr: str.toCharArray()){
                if(map.containsKey(chr)){
                    int flag=0;
                    for(int i: map.get(chr)){
                        if(!visited.containsKey(i) || visited.get(i)==false){
                            visited.put(i, true);
                            maxIndex = Math.max(i, maxIndex);
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0){
                        maxIndex = -1;
                        break;
                    }
                }else{
                    maxIndex = -1;
                    break;
                }
            }
            if(maxIndex != -1)
                ans.add(maxIndex+1);
            else ans.add(maxIndex);
        }

        return ans;
    }
}
