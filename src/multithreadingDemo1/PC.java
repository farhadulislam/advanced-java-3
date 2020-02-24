package multithreadingDemo1;
class Q{
int n;

synchronized int get(){
    System.out.println("Got: "+ n);
    return n;
}

synchronized void put(int n){
    this.n = n;
    System.out.println("Put: "+ n);

    }

}

class Producer implements Runnable{

    Q q;
    Thread t;

    Producer(){
        t = new Thread(this, "Producer");
    }

    public void run (){
        int i = 0;
        while (true){
            q.put(i++);
        }
    }
}

class Consumer implements Runnable{

    Q q;
    Thread t;

    Consumer(){
        t = new Thread(this, "Consumer");
    }

    public void run (){
        while (true){
            q.get();
        }
    }
}
public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer();
        Consumer c = new Consumer();

        
        //start the threads
        p.t.start();
        c.t.start();

        System.out.println("Press control c to stop");
    }

}
