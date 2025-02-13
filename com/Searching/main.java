package com.Searching;

import java.util.Random;

public class main {
    private void dataSets(int[] arr, int size) {
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(size - 10);
        }
    }

    void measurePerformance(int size) {
        int[] arr = new int[size];
        dataSets(arr, size);
        long start = 0;
        long end = 0;
        LinearSearch ls = new LinearSearch();
        start = System.nanoTime();
        ls.search(arr, arr[size - 23]);
        end = System.nanoTime();
        System.out.println("The Performance of the Linear Search is " + (end - start) + " ms");


        BinarySearch bs = new BinarySearch();
       // bs.mergeSort(arr);
        start = System.nanoTime();
        bs.search(arr, arr[size - 23]);
        end = System.nanoTime();
        System.out.println("The performace of the Binary Search Algorithm is " + (end - start) + " ms");

    }

    public static void main(String[] args) {
        main m = new main();
        int[] arr = {10000, 100000000, 1000000000};
        for (int i = 0; i < 3; i++) {
            System.out.println("Cheking for the "+arr[i]+" dataset");
            m.measurePerformance(arr[i]);
        }
    }
}