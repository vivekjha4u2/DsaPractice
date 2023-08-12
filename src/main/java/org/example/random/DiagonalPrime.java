package org.example.random;

public class DiagonalPrime {
    public static void main(String[] args) {
        DiagonalPrime diagonalPrime = new DiagonalPrime();
        int [][] nums = new int[][]{
                {1,2, 3, 4},
                {5,735,7,5},
                {9,11,10,8},
                {13,3,54,7}};
        int ans = diagonalPrime.diagonalPrime(nums);
        System.out.println(ans);
    }

    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int max = 0;
        for(int i=0;i<n;i++){
            int val = nums[i][i];
            int val2 = nums[i][n-i-1];

            if(checkPrime(val)){
                max = Math.max(val, max);
            }
            if(checkPrime(val2)){
                max = Math.max(val2, max);
            }
        }
        return max;
    }

    public boolean checkPrime(int val){
        boolean isPrime = true;
        for(int j=2; j<=Math.sqrt(val);j++){
            if(val%j == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
