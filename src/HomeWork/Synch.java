package HomeWork;

public class Synch {
    static Object o=new Object();
    static int num=10;

    public static void main(String[] args) {
        WaitThread W[]=new WaitThread[num];
        for (int i = 0; i < num; i++) {
            new WaitThread(o).start();
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Notifying our"+num+"threads.");
      synchronized (o){
            o.notify();
        }
    }
}
class WaitThread extends Thread{
    Object o;
    public WaitThread(Object o){this.o=o;}
    public void run(){
        synchronized (o){
            System.out.println(this);
            try {
                o.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           o.notify();
        }
        System.out.println(this+"notified");
    }
}
