package java_09m.interfacetest.test4;

public class Cat implements Animal{
    @Override
    public void move() {
        System.out.println(Action.MOVED);
        System.out.println(AnimalList.CAT + " " + Action.MOVED.toValueString());
    }

    @Override
    public void eat() {
        System.out.println(AnimalList.CAT +" "+ Action.EAT.toValueString());
    }

    @Override
    public void sleep() {
        System.out.println(AnimalList.CAT + " " + Action.SLEEP.toValueString());
    }

    @Override
    public void stop() {
        System.out.println(AnimalList.CAT + " " + Action.STOP.toValueString());
    }
}
