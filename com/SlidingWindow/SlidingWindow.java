package SlidingWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


public class SlidingWindow{
    static class Pair{// create the pair for the priority queue
        int value;
        int index;
        public Pair(int value,int index){
            this.value=value;
            this.index=index;
        }
    }
    public static List<Integer>maximumElement(int arr[],int n,int k){
        List<Integer>ans=new ArrayList<>();
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->b.value-a.value);
        for(int i=0;i<k;i++){// for the first Window of the Array
            pq.offer(new Pair(arr[i],i));
        } ans.add(pq.peek().value);
        for(int i=k;i<n;i++){
            pq.offer(new Pair(arr[i],i));
            while (pq.peek().index<=i-k){
                pq.poll();
            }
            ans.add(pq.peek().value);
        }
        return ans;


    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int k=3;
        List<Integer>ls=maximumElement(arr,n,k);
        for(int x:ls){
            System.out.println(x+" ");
        }
    }

}