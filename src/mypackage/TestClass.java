package mypackage;

public class TestClass {
    public static void main (String[] args) {

        Cat catObject = new Cat();
        Dog dog =  new Dog();
        Car car = new Car();

        catObject.color = "White";
        dog.color = "Black";

        catObject.walk("Backyard");
        dog.walk("Park");

        catObject.feed("Milk");
        dog.sit();

        System.out.println("Cat color is: " + catObject.color);
        System.out.println("Dog color is: " + dog.color);
        dog.sleep();
        dog.var = 10;

        System.out.println(dog.getWeight());
        dog.setWeight(10);
        System.out.println(dog.getWeight());

        dog.sound();
        catObject.sound();

        car.ride();
        car.stop();
    }
}
