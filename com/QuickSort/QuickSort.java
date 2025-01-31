package com.QuickSort;

import java.util.Arrays;

public class QuickSort {
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (i < high && arr[i] <= pivot) {
                i++;
            }
            while (j > low && arr[j] >= pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    private static void qsort(int[] arr, int low, int high) {
        if (low < high) {
            int pindex = partition(arr, low, high);
            qsort(arr, low, pindex - 1);
            qsort(arr, pindex + 1, high);
        }
    }

    public static int[] quickSort(int[] arr) {
        int n = arr.length;
        qsort(arr, 0, n - 1);
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

