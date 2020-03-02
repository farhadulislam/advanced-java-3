package multithreadingDemo1;


class A {

    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();

        System.out.println(name + " entered A.foo");


        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("B interrupted");
        }

        System.out.println(name + " trying to call B.last()");
    }

    synchronized void last() {

        System.out.println("Inside A.last");
    }


}

class B {
    synchronized void bar(B b) {
        String name = Thread . currentThread ().getName();

        System.out.println(name + " entered B.bar");


    try{
        Thread.sleep(1000);
    }catch(Exception e) {
        System.out.println("B interrupted");
    }

    System.out .println(name + " trying to call B.last()");

    synchronized void last(){

            System.out.println("Inside A.last");
        }
        }
class DeadLock implements Runnable {

    A a = new A();
    B b = new B();

    Thread t;


    DeadLock(){
        Thread.currentThread().setName("Main thread");
        t = new Thread(this, "RachingThread");
    }

    void deadLockStart(){
        t.start();

        a.foo(b);

        System.out.println("Back in main thread");

    }


    public void run(){

        b.bar(a);
        System.out.println("Back in main thread");
    }

    public static void main (String [] args){

        DeadLock d1 = new DeadLock();

        d1.deadLockStart();
    }
}
