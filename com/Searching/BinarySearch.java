package com.Searching;

import java.util.Arrays;

public class BinarySearch {
    public int search(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while (start<end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;

            }
        }
        return -1;

    }
    public int []mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return arr;

        }
        int mid = n / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, n));
        return merge(left, right);


    }
    int []merge(int[]left,int []right){
        int []mergedArray=new int[left.length+right.length];
        int i=0,j=0,k=0;
        while (i<left.length&&j<right.length){
            if(left[i]<right[i]){
                mergedArray[k++]=left[i++];
            }
            else{
                mergedArray[k++]=right[j++];

            }
        }
        while (i<left.length){
            mergedArray[k++]=left[i++];
        }
        while (j<right.length){
            mergedArray[k++]=right[j++];
        }
        return mergedArray;
    }
}
