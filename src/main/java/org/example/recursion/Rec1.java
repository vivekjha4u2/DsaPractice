package org.example.recursion;

public class Rec1 {
    public static void main(String[] args) {
        int n = 6;
//        printName(n);


//        print1toN(n);

//        sumOfFirstNNumbers1(0, 10); //parameterised

//        int sum = sumOfFirstNNumbers2( 10); //functional
//        System.out.println(sum);

//        int[] arr = new int[]{1,2,3,4,5};
//        reverseArr(arr,0,arr.length-1);

//        String str = "bamab";
//        boolean isPal = checkPalindrome(str, 0, str.length()-1);
//        System.out.println(isPal);

        //fibonacci
        int ans = fibonacci(n);
        System.out.println(ans);
    }

    // 0 1 1 2 3 5 8
    private static int fibonacci(int n) {
        if(n == 0 || n==1 ) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    private static boolean checkPalindrome(String str, int s, int e) {
        if(s>e){
            return true;
        }
        if(str.charAt(s) != str.charAt(e)){
            return false;
        }else {
            return checkPalindrome(str, s + 1, e - 1);
        }
    }

    private static void reverseArr(int[] arr, int s, int e) {
        if(s>e){
            for(int p: arr) System.out.print(p+" ");
            return;
        }
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        reverseArr(arr, s+1, e-1);
    }

    private static int sumOfFirstNNumbers2(int i) {
        if(i==0)return 0;
        return i+ sumOfFirstNNumbers2(i-1);
    }

    private static void sumOfFirstNNumbers1(int sum, int n) {
        if(n==0){
            System.out.println(sum);
            return;
        }
        sumOfFirstNNumbers1(sum+n, n-1);
    }

    private static void print1toN(int n) {
        if(n==0) return;
        System.out.println(n); //n to 1
        print1toN(n-1);
//        System.out.println(n); //1 to n
    }

    private static void printName(int n){
        if(n==0) return;
        System.out.println("Soliansilam");
        printName(n-1);
    }

//    print name 5 times
//    print 1 to n
//    print n to 1
//    print 1 to n - by backtracking
//    print n to 1 - by backtracking
}
