package MultiThreading.RunnableInterface;

public class ThreadDemo2 implements Runnable{

    private String tname;


    public ThreadDemo2(String tname) {
        this.tname = tname;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " = = " + this.tname);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
}
