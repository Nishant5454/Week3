package com.Selectionsort;

public class selectionSort {
    public static void selectionSort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int mini=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mini];
            arr[mini]=temp;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={0,2,3,-1,4};
        int n=arr.length;
        selectionSort(arr,n);
    }

}
