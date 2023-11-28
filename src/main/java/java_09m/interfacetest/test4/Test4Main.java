package java_09m.interfacetest.test4;

public class Test4Main {
    private static Dog dog;
    private static Cat cat;
    public static void main(String[] args) {
        cat = new Cat();
        cat.move();
        cat.stop();
        cat.eat();
        cat.sleep();

        dog = new Dog();
        dog.move();
        dog.stop();
        dog.eat();
        dog.sleep();
    }
}
