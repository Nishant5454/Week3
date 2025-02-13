package com.Stringconcat;

public class Main {
    public static void main(String[] args) {
        StringPerformance sp=new StringPerformance();
        int[]arr={100,1000,100000};
        for(int i=0;i<arr.length;i++){
            System.out.println("The Performance for the "+arr[i]+" dataset is ");
            sp.string("Hello",arr[i]);
            sp.stringBuffer("World",arr[i]);
            sp.stringBuilder("Hello",arr[i]);
            System.out.println();
        }
    }
}
