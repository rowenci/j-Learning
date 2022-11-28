package com.rowenci.Sort;

public class ShellSort {

    public static void shellSort(int arr[]){
        int temp, j;
        for(int gap = arr.length / 2; gap > 0; gap /= 2){
            for(int i = gap; i < arr.length; i++){
                temp = arr[i];
                j = i - gap;
                while(j >= 0 && temp < arr[j]){
                    arr[j + gap] = arr[j];
                    j -= gap;
                }
                arr[j + gap] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1, 6, 5, 9, 7, 8, 10};
        for (Integer i : arr) {
            System.out.println(i);
        }
        shellSort(arr);
        System.out.println("-----------");
        for (Integer i : arr) {
            System.out.println(i);
        }
    }
}
