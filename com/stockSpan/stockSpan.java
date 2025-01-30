package stockSpan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

//
//import java.sql.Array;
//import java.util.Arrays;
//
//class stockSpan {
//    public static int[] calculateStockSpan(int[] stocks) {
//        int n = stocks.length;
//        int[] span = new int[n];
//        for (int i = 0; i < n; i++) {
//            span[i] = 1;
//            for (int j = i - 1; j >= 0; j--) {
//                if (stocks[j] <= stocks[i]) {
//                    span[i]++;
//                } else {
//                    break;
//                }
//            }
//        }
//        return span;
//    }
//
//    public static void main(String[] args) {
//        int[] prices = {100, 80, 60, 70, 60, 75, 85};
//        int span[] = calculateStockSpan(prices);
//        System.out.println("Span of the stock is " + Arrays.toString(span));
//    }
//} // Time Complexiy wil be O(N^2) because we are traversing the array 2ice
// sc will be O(N)due to the extra span array
class stockSpan {
static ArrayList<Integer> calculatespan(ArrayList<Integer> arr) {
        int n = arr.size();
        ArrayList<Integer> span = new ArrayList<Integer>(Collections.nCopies(n, 0));
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr.get(st.peek()) <= arr.get(i)) {
                st.pop();
            }
            if (st.isEmpty()) {
                span.set(i, (i + 1));
            } else {
                span.set(i, (i - st.peek()));
            }
            st.push(i);
        }
        return span;

    }

    public static void main(String[] args) {
        ArrayList<Integer> value = new ArrayList<>(Arrays.asList(100, 80, 60, 70, 60, 75, 85));
ArrayList<Integer>finalstockspan=calculatespan(value);
for(int x:finalstockspan){
    System.out.println(x+" ");
}
}
}