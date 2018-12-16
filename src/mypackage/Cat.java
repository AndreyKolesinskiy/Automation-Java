package mypackage;

public class Cat extends Animal {

    public void feed(String food) {
        System.out.println("I like: " + food);
    }



    @Override
    public void sound (){
        System.out.println("Mew mew mew!");
    }
}
