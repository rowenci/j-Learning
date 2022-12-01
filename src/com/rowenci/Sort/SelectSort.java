package com.rowenci.Sort;

public class SelectSort {
    public static void selectSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){    // 有序数组
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1, 6, 5, 9, 7, 8, 10};
        for (Integer i : arr) {
            System.out.println(i);
        }
        selectSort(arr);
        System.out.println("-----------");
        for (Integer i : arr) {
            System.out.println(i);
        }
    }
}
