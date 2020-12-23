package com.wrx.js.web.wangrx;

import java.util.Arrays;

public class SuanFa {

    public static void main(String[] args) {
        MaoPao();
    }


    public static void MaoPao(){
        int arr[] = {8, 5, 3, 2, 4};

        for (int i = 0;i < arr.length ; i++){
            for(int j = 0; j < arr.length-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
