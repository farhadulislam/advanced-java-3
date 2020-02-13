package multithreadingDemo1;

class NewThread3 {

        String name;
        Thread t;
        NewThread3(String threadName){

            name = threadName;
            System.out.println("New thread: " + t);

        }

        public void run (){

            try{

                for (int i =5; i>0; i--){

                    System.out.println(name + " : "+ i);

                    Thread.sleep(1000);

                }
            }catch (InterruptedException e){

                System.out.println(name + " interrupted");

            }

            System.out.println("Exiting " + name);
        }


    }
    public class MultiThreadDemo {


        public static void main (String [] args) {
            NewThread3 nt1 = new NewThread3("One");
            NewThread3 nt2 = new NewThread3("Two");
            NewThread3 nt3 = new NewThread3("Three");

            nt1.t.start();
            nt2.t.start();
            nt3.t.start();

            try{


                    Thread.sleep(1000);

            }catch (InterruptedException e){

                System.out.println("Main thread interrupted");

            }

            System.out.println("Main thread exiting");
        }


    }


