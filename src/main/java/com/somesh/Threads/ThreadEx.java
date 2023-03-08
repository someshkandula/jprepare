package com.Threads;


// MyTask IS-A Thread
/*class Mytask extends Thread {
    @Override
    public void run(){
        for (int doc=1; doc<=10;doc++){
            System.out.println (" @@@@@ Printer 2 "+doc);
        }
    }
}*/
//public class ThreadEx extends CA , Thread{ // Error

public class ThreadEx implements Runnable { // Error

    @Override
    public void run(){
        for (int doc=1; doc<=10;doc++){
            System.out.println (" @@@@@ Printer 2 "+doc);
        }
    }

    public static void main(String[] args) {
        /*ThreadEx t = new ThreadEx ();
        t.setName ("Somesh");*/
        //t.start ();

        Runnable r = new ThreadEx ();
        Thread task = new Thread (   );

        // Job 1
        System.out.println (" Application started ");

        // Job 2
        //Mytask mytask = new Mytask (); // Child / sub thread
        //mytask.executeTask ();
        task.start ();

        // Job 3
        for (int doc=1; doc<=10;doc++){
            System.out.println (" ##### Printer 1 "+doc);
        }

        System.out.println (" Application end");
    }
}
