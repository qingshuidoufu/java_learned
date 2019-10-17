package HomeWork;

public class Bus implements Vehicle {
    @Override
    public void start(int arg) {
        System.out.println("Bus开了");
    }

    @Override
    public void stop(int arg) {
        System.out.println("Bus停了");
    }
}
