package com.wrx.js.web.SlidingWindow;

/**
 * @author: Wangruixia
 * @date: 2020/12/23 11:30
 */
public class SlidingWindowTest {
    public static void main(String[] args) {
        //1秒一个时间片，窗口共5个
        SlidingWindow window = new SlidingWindow(100, 4, 8);
        for (int i = 0; i < 100; i++) {
            System.out.println(window.addCount(2));

            window.print();
            System.out.println("--------------------------");
            try {
                Thread.sleep(102);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

