package com.rowenci.Sort;

public class InsertSort {
    public static void insertSort(int[] arr){
        int temp;
        int j;
        for (int i = 1; i < arr.length; i++)
        {
            temp = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > temp)
            {
                arr[j + 1] = arr[j];    // 找的时候把前面的往后挪
                j--;    // 待插入元素一次次往前挪
            }
            arr[j + 1] = temp;  // 找到位置，放进去。因为最后j为-1或者位置的前一个
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1, 6, 5, 9, 7, 8, 10};
        for (Integer i : arr) {
            System.out.println(i);
        }
        insertSort(arr);
        System.out.println("-----------");
        for (Integer i : arr) {
            System.out.println(i);
        }
    }
}
