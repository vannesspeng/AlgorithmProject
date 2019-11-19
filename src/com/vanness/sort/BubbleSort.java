package com.vanness.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};
        bubbleSort(array);
        //bubbleSortByMySelf(array);
        for (int k : array) {
            System.out.print(k + "-->");
        }
    }

    /**
     * 冒泡排序算法（1）思想：两两相邻的元素进行比较，较大的元素交换到靠后的问题
     * 时间复杂度：O(n的平方)
     *
     * @param array
     */
    public static void bubbleSort(int[] array) {
        long startTime = System.nanoTime();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.print((endTime - startTime) + "ns" + "\n");
    }


    public static void bubbleSortByMySelf(int[] array) {
        long startTime = System.nanoTime();
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = array.length - 1; j > array.length - 1 - i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.print((endTime - startTime) + "ns" + "\n");
    }
}
