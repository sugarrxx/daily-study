package com.lxx.sort;

import java.util.Arrays;

/**
 * 希尔排序，也称递减增量排序算法，是插入排序的一种更高效的改进版本。但希尔排序是非稳定排序算法
 * 希尔排序的基本思想是：先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，
 * 待整个序列中的记录"基本有序"时，再对全体记录进行依次直接插入排序
 *
 * @Author lxx
 * @Date 2021/6/29
 */
public class ShellSortDemo {

    public static void main(String[] args) {
        int[] arr = {77, 5, 7, 2, 56, 34, 67, 12, 33};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int[] arr) {
        int length = arr.length;
        int temp;
        for (int step = length / 2; step >= 1; step /= 2) {
            for (int i = step; i < length; i++) {
                temp = arr[i];
                int j = i - step;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + step] = arr[j];
                    j -= step;
                }
                arr[j + step] = temp;
            }
        }
    }
}
