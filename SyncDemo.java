package Synchronization;

class abc 
{
    /* Synchronized method */
    synchronized void print(int n)
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println(i * n);

        }
    }

    void printMessage(String msg) 
    {
        /* Synchronized block */
        synchronized (this) 
        {
            for (int i = 0; i < 5; ++i) 
            {
                System.out.println(Thread.currentThread().getId() + " " + msg);
            }
        }
    }
}

public class SyncDemo 
{

    public static void main(String[] args)
    {

        abc obj = new abc(); // same object should be passed

        /* Thread creation using anonymous run() method. */
        Thread t1 = new Thread() 
        {
            public void run() 
            {
                obj.print(10);
            }
        };

        Thread t2 = new Thread() 
        {
            public void run() 
            {
                obj.print(13);
            }
        };

        t1.start();
        t2.start();

        Thread t3 = new Thread() 
        {
            public void run() 
            {
                obj.printMessage("hello");
            }
        };

        Thread t4 = new Thread() 
        {
            public void run() 
            {
                obj.printMessage("hey");
            }
        };

        t3.start();
        t4.start();
    }

}