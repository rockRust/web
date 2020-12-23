package com.wrx.js.web.wangrx;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    int p1 = 0;
         int p2 = 0;
        public Solution(int arg){
                p1 = arg;
            }
            public static void main(String args[]){
                Thread t = new Thread() {
                    public void run() {
                        cnn();
                    }
                };
                t.run();
                System.out.print("FakeNews ");
                System.out.print("; ");
                t.start();
                System.out.print("FakeNews ");
            }
    static void cnn() {
        System.out.print("CNN ");
    }

    /*static class StrObject{
        String str;
        public StrObject(String str){
            this.str = str;
        }
        public void setStr(String str){
            this.str = str;
        }
        @Override
        public String toString() {
            return str;
        }
    }*/


    private static Integer method(Integer i){
        try{
            if(i++ > 0)
                throw new IOException();
            return i++;
        }catch (IOException e){
            i++;
            return i++;
        }catch (Exception e){
            i++;
            return i++;
        }finally {
            return i++;
        }
    }

    public static int calc(int n) {
        try {
            n += 1;
            if (n / 0 > 0) {
                n += 1;
            } else {
                n -= 10;
            }
            return n;
        } catch (Exception e) {
            n++;
        }
        n++;
        return n++;
    }
}
