package com.rowenci.Sort;

public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right, int[] temp){
        if(left < right){
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid, temp);
            mergeSort(arr, mid + 1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }
    // 使用临时数组直接存储
    public static void merge(int[] arr, int left, int mid, int right, int[] temp){
        int i = left;
        int j = mid + 1;
        int k = 0;
        // 较小的数放临时数组里面
        while(i <= mid && j <= right){
            if(arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }
        // 没放完的放进去
        while (i <= mid)
            temp[k++] = arr[i++];
        // 没放完的放进去
        while (j <= right)
            temp[k++] = arr[j++];
        // 临时数组里面的数放原数组里面
        for(i = 0; i < k; i++)
            arr[i + left] = temp[i];
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1, 6, 5, 9, 7, 8, 10};
        int[] temp = new int[10];
        for (Integer i : arr) {
            System.out.println(i);
        }
        mergeSort(arr, 0, arr.length - 1, temp);
        System.out.println("-----------");
        for (Integer i : arr) {
            System.out.println(i);
        }
    }
}
