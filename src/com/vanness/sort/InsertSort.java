package com.vanness.sort;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};
        insertSort(array);
        for (int k : array) {
            System.out.print(k + "-->");
        }
    }

    /**
     * 插入排序算法：
     * 时间复杂度：n*n
     *
     * @param arr
     */
    public static void insertSort(int[] arr) {
        int i, j, insertNum;
        for (i = 1; i < arr.length; i++) {
            insertNum = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > insertNum) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = insertNum;
        }
    }
}
