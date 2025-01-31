package com.Bubblesort;

import java.util.ArrayList;

 class bubbleSort {
     public static void bubbleSort(int arr[], int n) {
         // ArrayList<Integer>at=new ArrayList<>();
         for (int i = 0; i < n; i++) {
             for (int j = i + 1; j < n; j++) {
                 if (arr[j] < arr[i]) {
                     int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
             }
         }
         for (int x : arr) {
             System.out.print(x+" ");
         }
     }

     public static void main(String[] args) {
         int arr[] = {2, 1, 0, 4};
         int n = arr.length;
         bubbleSort(arr, n);
     }
 }
// Time Complexity wiil be O(n^2);
