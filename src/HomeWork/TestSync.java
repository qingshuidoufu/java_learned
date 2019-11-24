package HomeWork;

public class TestSync {
    public static void main(String[] args) {
        TS ts=new TS();
        Thread t1=new Thread(ts);
        Thread t2=new Thread(ts);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
class TS implements Runnable{
        Timer timer=new Timer();

    @Override
    public void run() {
        timer.add(Thread.currentThread().getName());
    }
}
class Timer{
    private static int num=0;
    public synchronized void add(String name) {
        //public void add(String name){
       synchronized (this) {
            num++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println(name + "你是第" + num + "使用Timer的线程");

        }
    }
   }

