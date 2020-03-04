package com.demo.multithreading01;

class NewThread28 implements Runnable{
    String name;
    Thread t;

    boolean suspendFlag;

    NewThread28(String threadName){

        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread : "+ t);
        suspendFlag = false;
    }

    public void run(){
        try{

            for (int i = 15; i<0; i--){

                System.out.println(name + ": "+ i);
                Thread.sleep(200);
                synchronized (this){
                    while(suspendFlag){
                        wait();
                    }
                }
            }
        }catch (InterruptedException e){
            System.out.println(name+ " interrupted");
        }
        System.out.println(name+ " exting");
    }
    synchronized void mysuspend(){
        suspendFlag = true;
    }

    synchronized void myrsesume(){
        suspendFlag = false;
        notify();
    }
}




public class SuspendResume {

    public static void main(String [] args){

        NewThread28 ob1 = new NewThread28("One");
        NewThread28 ob2 = new NewThread28("Two");

        ob1.t.start();;
        ob2.t.start();
        try{

            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Suspending thread one");
            Thread.sleep(1000);
            ob1.myrsesume();
            System.out.println("Resuming thread one");


            Thread.sleep(1000);
            ob2.mysuspend();
            System.out.println("Suspending thread two");
            Thread.sleep(1000);
            ob2.myrsesume();
            System.out.println("Resuming thread two");


        }catch(InterruptedException e){

            System.out.println("Main thread interrupted");

        }

        //wait for the threads to finish

        try{

            System.out.println("Waiting for the threads to finish");

            ob1.t.join();
            ob2.t.join();

        }catch(InterruptedException e){

            System.out.println("Main thread interrpted");
        }


        System.out.println("Main thread exiting");
    }
}
