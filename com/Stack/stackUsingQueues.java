package com.linkedlist.com.Stack;

import java.util.Stack;

class stack {
    // Two stacks
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void Insert(int x) {
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
    }

    // Pop from Queue
    public int Pop() {
        if (s1.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;  // Return an error value
        }
        return s1.pop();
    }

    public int peek() {
        if (s1.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;  // Return an error value
        }
        return s1.peek();
    }

    public int sizeofQueue() {
        return s1.size();
    }
}

public class stackUsingQueues{
    public static void main(String[] args) {
        stack st = new stack();
        st.Insert(8);
        st.Insert(9);
        st.Insert(10);
        System.out.println("The element that is popped is " + st.Pop());
        System.out.println("The top Element of the Queue is " + st.peek());
        System.out.println("The size of the Queue is " + st.sizeofQueue());
    }
}
