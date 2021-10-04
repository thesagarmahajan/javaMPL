package MultiThreading;

public class ThreadDemo1 extends Thread{
    
    private String threadName;

    public ThreadDemo1(String threadName) {
        super(threadName);
        this.threadName = threadName;
    }

    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i+" ( "+this.threadName+" )");
        }
    }

}
