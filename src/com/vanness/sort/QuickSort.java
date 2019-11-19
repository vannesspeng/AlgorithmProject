package com.vanness.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};


        quickSort(array, 0, array.length - 1);
        for (int k : array) {
            System.out.print(k + "-->");
        }
    }

    //快速排序的算法时间复杂度n*logn
    private static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        //int mid = partition(arr, low, high);
        int mid = partitionOther(arr, low, high);
        quickSort(arr, low, mid - 1);
        quickSort(arr, mid + 1, high);
    }

    /**
     * @param arr   待排序数组
     * @param start 数组排序片段起始下标
     * @param end   数组排序片段结束下标
     * @return 返回子排序数列的分割点下标
     */
    public static int partition(int[] arr, int start, int end) {
        int i = start;
        int j = end;
        int key = arr[i];
        while (i < j) {
            while (i < j && arr[j] >= key) {
                j--;
            }
            arr[i] = arr[j];
            while (i < j && arr[i] <= key) {
                i++;
            }
            arr[j] = arr[i];
        }
        arr[i] = key;
        return i;
    }

    /**
     * 算法中 i 记录的是比key小的序列的尾下标
     *
     * @param a 待排序数组
     * @param p 待排序数组的起始坐标
     * @param r 待排序数组的结束坐标
     * @return 返回子排序数列的分割点下标
     */
    private static int partitionOther(int[] a, int p, int r) {
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (a[j] < a[r]) {
                i = i + 1;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

            }
        }
        i = i + 1;
        int temp = a[i];
        a[i] = a[r];
        a[r] = temp;
        return i;
    }
}
