package demo1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        int a[][] = {
//        {1,2,3}
//        ,{4,5}
//        ,{6}};
        int[][] a = new int[][]{{1,2,3},{4,5},{6}};
        int sum = 0;

//        Arrays.stream(a).forEach();

        //
        int [] arr= new int[]{1,2,3,4,5,6,9,7};
        int max = Arrays.stream(arr).max().getAsInt();
        int ans = Arrays.stream(arr).filter(i->i < max).max().getAsInt();
//        System.out.println(ans);
        //


        //1,2,3
        //m1 = 3
        //m2 = 2
        int mx = 0;
        int answer = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
                answer = mx;
            }
        }
//        int answer = 0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] > answer && arr[i] <mx){
//                answer = arr[i];
//            }
//        }
//        System.out.println(answer);
    }
}
