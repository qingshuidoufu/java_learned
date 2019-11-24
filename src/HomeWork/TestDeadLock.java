package HomeWork;

public class TestDeadLock {
    public static void main(String[] args) {
        TDL tdl1=new TDL();
        TDL tdl2=new TDL();
        tdl1.flag=1;
        tdl2.flag=0;
        Thread t1=new Thread(tdl1);
        Thread t2=new Thread(tdl2);
        t1.start();
        t2.start();

    }
}
class TDL implements Runnable{
        public int flag=1;
        static Object o1=new Object();
        static Object o2=new Object();


    @Override
    public void run() {
        System.out.println("flag="+flag);
        if (flag==1){
            synchronized (o1){
                try {
                    Thread.sleep(500);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2){
                    System.out.println("1");;
                }
            }

        }
        if (flag==0){
            synchronized (o2){
                try {
                    Thread.sleep(500);

            } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1){
                    System.out.println("0");
                }
            }
        }
    }
}
