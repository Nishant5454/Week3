package Hashmap;


import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {
    public static void indice(int arr[], int n, int target) {
       ArrayList<int []> st = new ArrayList<>();
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int currentElement = arr[i];
            int targetvalue = target - currentElement;
            if (mp.containsKey(targetvalue)) {
//                int ele=st.get(i)[0];
                st.add(new int[]{mp.get(targetvalue),i});
//                st.add().;
//                st.add(mp.get(target));
            }
            mp.put(currentElement,i);


        }
        if (st.size() >= 1) {
            for (int[] x : st) {
                System.out.println("The require indices is " + x[0]+" "+x[1]);
            }
        } else {
            System.out.println("No such Indices Found in the array");
        }

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int target = 7;
        indice(arr, n, target);
    }
}
