package com.wrx.js.web.wangrx;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int a[] = {2,3,6,1,7,0,9};
        int b[] = {5,4,3};
        //System.out.println(Arrays.toString(insertionSort(b)));
        System.out.println(Arrays.toString(quickSort(a,0,6)));
    }

    //插入排序
    public static int[] insertionSort(int a[]){
        if(a.length<=1){
            return a;
        }
        int j;
        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            for(j=i-1 ; j>=0 ; j--){
                if(a[j]>value){
                    a[j+1] = a[j];
                }else {
                    break;
                }
            }
            System.out.println(j);
            a[j+1] = value;
        }

        return a;
    }

    public static int[] bubbleSort(int a[]){
        if(a.length <= 1){
            return a;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }

    public static int[] quickSort(int a[],int p,int r){
        if(p>=r){
            return a;
        }

        //取出最后一个值
        int partition = a[r];
        int j = p;

        for (int i = p;i<r;i++){
            if(a[i] < partition){
                /*if(i==j){
                    j++;
                }else {*/
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    j++;
                //}
            }
        }
        a[r] = a[j];
        a[j] = partition;

        quickSort(a, 0, j - 1);
        quickSort(a, j + 1, r);

        return a;
    }
}
