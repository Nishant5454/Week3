package com.MergeSort;

import java.util.ArrayList;

public class mergeSort {
    public static void mergeSort(int arr[], int start, int mid, int end) {
        ArrayList<Integer> al = new ArrayList<>();
        int low = start;
        int high = mid + 1;
        while (low <= mid && high <= end) {
            if (arr[low] <= arr[mid]) {
                al.add(arr[low]);
                low++;
            } else {
                al.add(arr[high]);
                high++;
            }
        }
        while (low <= mid) {
            al.add(arr[low]);
            low++;
        }
        while (high <= end) {
            al.add(arr[high]);
            high++;
        }
        for (int i = 0; i < al.size(); i++) {
            arr[start + i] = al.get(i);
        }
    }

    public static void merger(int arr[], int low, int high) {
        if(low>=high){
            return;
        }
        int mid = (low + high) / 2;
        merger(arr, low, mid);
        merger(arr, mid + 1, high);
        mergeSort(arr, low, mid, high);
    }
    public static void main(String[] args) {
        int arr[] = {0, -1, -2, 1, 2, 4, 5};
        int n = arr.length;

        merger(arr, 0, n - 1);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
