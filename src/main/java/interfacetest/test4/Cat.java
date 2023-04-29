package interfacetest.test4;

public class Cat implements Animal{
    Action action;
    @Override
    public void move() {
        System.out.println(AnimalList.CAT + " " + Action.MOVED);
    }

    @Override
    public void eat() {
        System.out.println(AnimalList.CAT +" "+ Action.EAT.values());
    }

    @Override
    public void sleep() {
        System.out.println(AnimalList.CAT + " " + Action.SLEEP);
    }

    @Override
    public void stop() {
        System.out.println(AnimalList.CAT + " " + Action.STOP);
    }
}
