package com.rowenci.Sort;

public class QuickSort {
    public static void quickSort(int[] arr, int left, int right){
        if(left < right){
            int pivot = partition1(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }
    public static int partition(int[] arr, int left, int right){
        int pivot = arr[left];
        while(left < right){
            while(left < right && pivot <= arr[right])
                right--;
            arr[left] = arr[right];
            while(left < right && pivot >= arr[left])
                left++;
            arr[right] = arr[left];
        }
        arr[left] = pivot;
        return left;
    }

    public static int partition1(int[] arr, int left, int right){
        int begin = left;
        int pivot = arr[left];
        while(left < right){
            while(left < right && pivot <= arr[right])
                right--;
            while(left < right && pivot >= arr[left])
                left++;
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        int temp = arr[left];
        arr[left] = pivot;
        arr[begin] = temp;
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1, 6, 5, 9, 7, 8, 10};
        for (Integer i : arr) {
            System.out.println(i);
        }
        quickSort(arr, 0, arr.length - 1);
        System.out.println("-----------");
        for (Integer i : arr) {
            System.out.println(i);
        }
    }
}
