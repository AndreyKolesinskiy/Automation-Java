package mypackage;

public class Car implements Transport {
    static int var = 10;
    static void method(){
        System.out.println("Static method.");
    }


    @Override
    public void ride() {
        System.out.println("We are riding");
    }

    @Override
    public void stop() {
        System.out.println("We are stopping");
    }
}
