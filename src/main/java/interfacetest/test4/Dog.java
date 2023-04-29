package interfacetest.test4;

public class Dog implements Animal{

    @Override
    public void move() {
        System.out.println(AnimalList.DOG + "->" + Action.MOVED.values());
    }

    @Override
    public void eat() {
        System.out.println(AnimalList.DOG +"->"+ Action.EAT.values());
    }

    @Override
    public void sleep() {
        System.out.println(AnimalList.DOG + "->" + Action.SLEEP);
    }

    @Override
    public void stop() {
        System.out.println(AnimalList.DOG + "->" + Action.STOP);
    }
}
