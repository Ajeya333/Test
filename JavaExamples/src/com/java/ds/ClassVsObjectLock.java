package com.java.ds;


// Java program to illustrate Callable and FutureTask
//for random number generation
class ClassVsObjectLock implements Runnable {
    public void run() { Lock(); }
 
    public void Lock()
    {
        System.out.println(
            Thread.currentThread().getName());
        synchronized (ClassVsObjectLock.class)
        {
            System.out.println(
                "in block "
                + Thread.currentThread().getName());
            System.out.println(
                "in block "
                + Thread.currentThread().getName()
                + " end");
        }
    }
 
    public static void main(String[] args)
    {
    	ClassVsObjectLock g1 = new ClassVsObjectLock();
        Thread t1 = new Thread(g1);
        Thread t2 = new Thread(g1);
        ClassVsObjectLock g2 = new ClassVsObjectLock();
        Thread t3 = new Thread(g2);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }
}