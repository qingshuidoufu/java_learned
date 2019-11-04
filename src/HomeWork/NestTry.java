package HomeWork;

public class NestTry {
    public static void main(String[] args) {
        int  k;
        int i;
        try{
            System.out.println("这是第一层try的开始");
            try{
                System.out.println("这是第二层try");
                int b[]=null;
                k=b[0];
                System.out.println("这是第二层try结束");
            } catch (Exception e) {
                System.out.println(e);
            }finally {
                System.out.println("这是第一层finally!");
            }
            i=10/0;
            System.out.println("这是第一层try结束!");
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("这是第二层finally!");
        }
    }
}
