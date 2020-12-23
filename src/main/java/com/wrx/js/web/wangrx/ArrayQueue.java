package com.wrx.js.web.wangrx;

public class ArrayQueue {
    //数组
    private String[] items;
    //数组长度
    private int n;
    //队列头下标
    private int head;
    //队列尾下标
    private int tail;

    //申请一个长度为capacity的数组
    public ArrayQueue(int capacity){
        items = new String[capacity];
        n=capacity;
    }

    //入队操作
    public boolean enqueue(String item){
        if(tail == n){
            //如果尾在数组最后则队列已满
            return false;
        }
        items[tail] = item;
        ++tail;
        return true;
    }

    //出队操作

    public String dequeue(){
        //如果头和尾相等则队列为空
        if(head == tail){
            return null;
        }
        String res = items[head];
        ++head;
        return res;
    }
}
