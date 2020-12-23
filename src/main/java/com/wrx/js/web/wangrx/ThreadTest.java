package com.wrx.js.web.wangrx;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {

    public static void main(String[] args) {
        //使用线程池将所有线程放入一个队列，保证顺序输出
        /*ExecutorService pool = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            pool.submit(()-> System.out.println("A"));
            pool.submit(()-> System.out.println("B"));
            pool.submit(()-> System.out.println("C"));
        }*/
        Param param = new Param();
        new Thread(new Letter(param,"A",0)).start();
        new Thread(new Letter(param,"B",1)).start();
        new Thread(new Letter(param,"C",2)).start();

    }
}

class Letter implements Runnable{
    private Param param;
    private String name;
    private int process;

    public Letter(Param param, String name, int process) {
        this.param = param;
        this.name = name;
        this.process = process;
    }

    @Override
    public void run() {
        synchronized (param) {

            for (int i = 0; i < 10; i++) {
                int state = param.getState();
                while (state != process) {
                    try {
                        param.wait();//进入阻塞状态，释放该param对象 锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    state = param.getState();//再一次的获取最新的状态
                }

                System.out.println("----- " + name + " -----");
                param.setState(++state % 3);//设置状态
                param.notifyAll();//释放其他的2个阻塞状态
            }
        }

    }
}

class Param{
    private int state = 0;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Param{" +
                "state=" + state +
                '}';
    }
}
