package MultiThreading.RunnableInterface;

public class RunnableInterfaceExample {
    public static void main(String[] args) {
        ThreadDemo2 td1 = new ThreadDemo2("Thread-1");
        ThreadDemo2 td2 = new ThreadDemo2("Thread-2");
        Thread t1 = new Thread(td1);
        Thread t2 = new Thread(td2);
        t1.start();
        t2.start();
        // td1.run();
        // td2.run();
    }   
}
