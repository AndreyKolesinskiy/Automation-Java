package mypackage;

public class TestClass {
    public static void main (String[] args) {

        Cat cat = new Cat();
        Dog dog =  new Dog();

        cat.color = "White";
        dog.color = "Black";

        cat.walk("Backyard");
        dog.walk("Park");

        cat.feed("Milk");
        dog.sit();

        System.out.println("Cat color is: " + cat.color);
        System.out.println("Dog color is: " + dog.color);
        dog.sleep();
        dog.var = 10;

        System.out.println(dog.getWeight());
        dog.setWeight(10);
        System.out.println(dog.getWeight());

        dog.sound();
        cat.sound();
    }
}
