package com.tianyongwei.algorithm.leetcode;

import java.util.Stack;

public class L0155MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public L0155MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
        minStack.add(Integer.MAX_VALUE);
    }
    
    public void push(int x) {
        minStack.add(Math.min(minStack.peek(), x));
        stack.add(x);
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

