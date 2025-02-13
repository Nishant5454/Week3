package com.Sorting;

public class QuickSort {
    public void quickSort(int[]arr){// main method to sort the element of the array
        sort(arr,0,arr.length-1);
    }
    public void sort(int[]arr,int low,int high){
        if(low>=high){
            return;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];
        while (start<=end){
            while (pivot>arr[mid]){
                start++;
            }
            while (pivot<arr[mid]){
                end--;
            }
            if(start<=end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        sort(arr,low,end);
        sort(arr,start,high);

    }
    public void swap(int[]arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
