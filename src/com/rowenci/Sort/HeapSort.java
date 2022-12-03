package com.rowenci.Sort;

public class HeapSort {
    public static void heapSort(int[] arr){

    }

    public static void buildMaxHeapSort(int[] arr){
        for(int i = arr.length / 2; i > 0; i++)
            headAdjust(arr, i);
    }

    public static void headAdjust(int[] arr, int k){
        arr[0] = arr[k];
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1, 6, 5, 9, 7, 8, 10};
        for (Integer i : arr) {
            System.out.println(i);
        }
        heapSort(arr);
        System.out.println("-----------");
        for (Integer i : arr) {
            System.out.println(i);
        }
    }
}
