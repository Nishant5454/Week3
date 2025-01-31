package com.InsertionSort;

public class InsertionSort {
    public static void InsertionSort(int arr[],int n) {
        for (int i = 0; i <=n-1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int swap = arr[j-1];
                arr[j - 1] = arr[j];
                arr[j] = swap;
                j--;
            }
        }
        for (int x : arr) {
            System.out.println(x + " ");
        }
    }

    public static void main(String[] args) {
        int arr[]={2,1,3,0};
        int n=arr.length;
        InsertionSort(arr,n);
    }
}
// Time Complexity wiil be O(n^2)

