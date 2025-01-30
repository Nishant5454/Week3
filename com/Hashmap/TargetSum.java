package Hashmap;

import java.util.ArrayList;
import java.util.HashSet;

public class TargetSum {
    public static boolean isPossible(int arr[], int target, int n) {
       // ArrayList<int[]> at = new ArrayList<>();


        HashSet<Integer> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int value = target - arr[i];
            if (st.contains(value)) {
                return true;
            }
            st.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,7};
        int n=arr.length;
        int target=5;
        if(isPossible(arr,n,target))
            System.out.println("Possible");
        else
        System.out.println("Not Possible");
    }
}
