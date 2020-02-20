package multithreadingDemo1;


class Callme2{

    void call(String msg){


        System.out.print("["+msg);

        try{

            Thread.sleep(1000);

        }catch(InterruptedException e){}

        System.out.println("Interrupted");
    }

}

class Caller2 implements Runnable{
    String msg;
    Callme2 target;
    Thread t;

    public Caller2(Callme2 targ, String s){

        target = targ;
        msg = s;
        t = new Thread(this);
    }


    @Override
    public void run() {
        synchronized (target){

            target.call(msg);
        }
    }
}

public class Synch1 {

    public static void main (String [] args){
        Callme2 target = new Callme2();
        Caller2 ob1 = new Caller2(target, "Hello");
        Caller2 ob2 = new Caller2(target, "Synchronized");
        Caller2 ob3 = new Caller2(target, "World");


        ob1.t.start();
        ob2.t.start();
        ob3.t.start();
        //wait for threads to end

        try{

            ob1.t.join();
            ob2.t.join();
            ob3.t.join();

        }catch(InterruptedException e){

            System.out.println("Interrupted");


        }
    }


}
