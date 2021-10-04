package MultiThreading;

public class MultiThreadingExample {
    public static void main(String[] args) {
        ThreadDemo1 t1 = new ThreadDemo1("ThreadNo-1111");
        ThreadDemo1 t2 = new ThreadDemo1("ThreadNo-2222");
        t1.start();
        t2.start();
    }

    /* 
        Storing start time
        creating thread 1 (For printing prime numbers between 1 to 50000)
        thread1.start()
        Storing end time
        Calculating end time - start time to get the lapsed time (x)
        ----------------------------------------------------------------------
        Storing start time
        creating thread 1 (For printing prime numbers between 1 to 25000)
        creating thread 2 (For printing prime numbers between 25001 to 50000)

        thread1.start()
        thread2.start()
        Storing end time
        Calculating end time - start time to get the lapsed time (x/2)

    */
}