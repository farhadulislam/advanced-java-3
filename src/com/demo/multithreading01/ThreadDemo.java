package com.demo.multithreading01;


class NewThread implements Runnable{

    Thread t;

    NewThread(){

        t = new Thread(this, "demo thread");
    }


    @Override
    public void run() {

        try{

            for (int i =5; i>0; i--){

                System.out.println("Child thread: "+ i);

                Thread.sleep(1000);

            }
        }catch (InterruptedException e){

            System.out.println("Child thread interrupted");

        }

    }
}
public class ThreadDemo {

    public static void main (String [] args){


        Thread nt = new Thread();

        nt.start();

        try{
            for(int i =5 ; i >0 ; i--){

                System.out.println("Main thread: "+ i);

                Thread.sleep(1000);
            }

        }catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }



    }
}
