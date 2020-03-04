package demo.generic01;

public class Dummy {


    public static Integer tracker;

    public static void main (String [] args){
        init();
        doSomething();

        //var contextSensitiveVar = 10; Not yet ready

        System.out.println(tracker);
    }

    public static void doSomething(){

        System.out.println("doing something .....");
        tracker++;

    }
    public static void init(){
        if (tracker==null){
            tracker = 0;
        }


    }
}
