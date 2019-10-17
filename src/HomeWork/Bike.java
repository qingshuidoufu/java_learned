package HomeWork;

public class Bike implements Vehicle{
    @Override
    public void start(int arg) {
        System.out.println("Bike开了");
    }

    @Override
    public void stop(int arg) {
        System.out.println("Bike停了");
    }
}
