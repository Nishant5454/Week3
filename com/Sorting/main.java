package com.Sorting;

import com.comparingDataStructure.Main;

import java.util.Arrays;
import java.util.Random;

public class main {
    // testing dataset
    private void dataset(int[] arr, int size) {
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(size - 10);

        }
    }

    void measurePerformance(int size) {
        int[] arr = new int[size];
        dataset(arr, size);
        long start = 0;
        long end = 0;
        BubbleSort ls = new BubbleSort();
        int temp[] = Arrays.copyOf(arr, size);
        start = System.nanoTime();
        ls.bubbleSort(temp);
        end = System.nanoTime();
        System.out.println("The Performance of the Bubble Sort is " + (end - start) / 1e6 + " ms");
        Mergesort ms = new Mergesort();
        start = System.nanoTime();
        ms.mergeSort(arr);
        end = System.nanoTime();
        System.out.println("The Performance of the Merge Sort is " + (end - start) / 1e6 + "ms");
        QuickSort qs = new QuickSort();
        start = System.nanoTime();
        qs.quickSort(arr);
        end = System.nanoTime();
        System.out.println("The performance of the Quick Sort is " + (end - start) / 1e6 + "ms");


    }


    public static void main(String[] args) {
        main m=new main();
        int[]arr={100,10000,100000};
        for(int i=0;i<3;i++){
            System.out.println("The performance of the "+arr[i]+"dataset");
            m.measurePerformance(arr[i]);
        }
    }
}
