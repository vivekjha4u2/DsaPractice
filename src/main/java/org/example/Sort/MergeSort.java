package org.example.Sort;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = new int[]{5,3,8,9,2,1,4};
        mergeSort(arr, 0, arr.length-1);
        for(int i: arr) System.out.print( i+" ");
    }

    private static void mergeSort(int[] arr, int start, int end) {

        if(start < end) {
            int mid = (start+end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }

    }

    private static void merge(int []arr, int start, int mid, int end) {

        int m = mid-start+1;
        int n = end-mid;
        
        int L[] = new int[m];
        int R[] = new int[n];

        for (int i = 0; i < m; i++) {
            L[i] = arr[start+i];
        }
        for (int i = 0; i < n; i++) {
            R[i] = arr[mid+i+1];
        }

        int i=0,j=0;
        int k=start; //*****IMP*****

        while(i<m && j<n){
            if(L[i] < R[j]){
                arr[k] = L[i];
                k++;i++;
            }
            else{
                arr[k] = R[j];
                k++;j++;
            }
        }
        while(i < m){
            arr[k] = L[i];
            k++;i++;
        }
        while(j < n){
            arr[k] = R[j];
            k++;j++;
        }

    }
}
