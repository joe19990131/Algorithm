package com.DSA1.Soft;

public class heapSort extends SortBase{

    public static void heapSort(int[] arr) {
        SortBase sortBase = new SortBase();
        for(int n : arr){
            while (n>0){
                while ((n>((n-1)/2)) && n%2!=0) {
                    sortBase.swap(arr[n],arr[(n-1)/2]);
                }
                while ((n>((n-2)/2)) && n%2 == 0) {
                    sortBase.swap(arr[n],arr[(n-2)/2]);
                }
            }
        }
    }
    public static void print(int[] arr) {
        for(int n :arr){
            System.out.print(arr[n]+"\t");
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,6,4,1,2,7,3,8,9,0};
        heapSort(nums);
        print(nums);
    }

}

