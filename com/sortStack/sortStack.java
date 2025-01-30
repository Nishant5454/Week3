package com.sortStack;

import java.util.Stack;

class sortStack {
     public static void sortStack(Stack<Integer>stack) {
         if (!stack.isEmpty()) {
             int temp = stack.pop();
             sortStack(stack);
             insertInSortedOrder(stack,temp);

         }
     }
         private static void insertInSortedOrder(Stack<Integer>stack,int element){

         if(stack.isEmpty()||stack.peek()<=element){
             stack.push(element);
         }
         else{
             int top=stack.pop();
             insertInSortedOrder(stack,element);
             stack.push(top);
         }


         }

    public static void main(String[] args) {

         Stack<Integer>st=new Stack<>();
         st.push(0);
         st.push(-1);
         st.push(-2);
         st.push(3);
         sortStack(st);
        System.out.println("Sorted Stack is "+st);
    }


}
