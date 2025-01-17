package com.devSense.leets;

/***
Design a stack that supports increment operations on its elements.
***/

class CustomStack {

    private int [] stackarray;
    private int topIndex;

    public CustomStack(int maxSize) {
        stackarray = new int[maxSize];
        topIndex = -1;
    }

        public void push(int x) {
        if(topIndex < stackarray.length-1){
            stackarray[++topIndex] = x;
        }
    }

    public int pop() {
        if(topIndex >=0){
            return stackarray[topIndex--];
        }
        return -1;
    }

    public void increment(int k, int val) {
        int limit = Math.min(k, topIndex+1);
        for (int i=0; i< limit; i++){
            stackarray[i] += val;
        }
    }

    public static void main(String[] args) {
        CustomStack obj = new CustomStack(5);
        obj.push(1);
        int param_2 = obj.pop();
        obj.increment(2, 100);

        System.out.println("Stack looks like" + obj.toString());
    }
}



