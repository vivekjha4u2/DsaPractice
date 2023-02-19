package org.example.random;

import java.util.HashMap;
import java.util.Map;

public class DataSt {
    //queue stack sort
    public static void main(String[] args) {
        System.out.println(checkInclusion("adc", "dcda"));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int i=0,j=0;int p=0;
        Map<Character, Integer> freqs1 = new HashMap<>();
        while(p < l1){
            freqs1.put(s1.charAt(p), freqs1.getOrDefault(s1.charAt(p),0)+1);
            p++;
        }
        Map<Character, Integer> freq = new HashMap<>();
        while(j < l1){
            freq.put(s2.charAt(j), freq.getOrDefault(s2.charAt(j),0)+1);
            j++;
        }

        while(j <= l2){

            boolean flag = true;
            for(Map.Entry<Character, Integer> entry : freqs1.entrySet()){
                if( !(freq.get(entry.getKey()) == entry.getValue()) ){
                    //aage badho
                    flag = false;
                    break;
                }
            }
            if(flag == true)
                return true;

            freq.put(s2.charAt(j), freq.getOrDefault(s2.charAt(j),0)+1);
            freq.put(s2.charAt(i), freq.getOrDefault(s2.charAt(i),0)-1);
            i++;
            j++;

        }
        return false;
    }
}
