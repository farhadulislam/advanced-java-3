package demo.multithreading01;


class NewThread2 extends Thread{

    NewThread2(){

        super("demo thread");
        System.out.println("Child thread: " + this);

    }

    public void run (){

        try{

            for (int i =5; i>0; i--){

                System.out.println("Child thread: "+ i);

                Thread.sleep(1000);

            }
        }catch (InterruptedException e){

            System.out.println("Child thread interrupted");

        }

        System.out.println("Exiting Child thread");
    }


}
public class ExtendThreadDemo {


    public static void main (String [] args) {
        NewThread2 nt2 = new NewThread2();

        nt2.start();

        try{

            for (int i =5; i>0; i--){

                System.out.println("Main thread: "+ i);

                Thread.sleep(1000);

            }
        }catch (InterruptedException e){

            System.out.println("Main thread interrupted");

        }

        System.out.println("Main Child thread");
    }


}
