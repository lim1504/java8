package interfacetest.test6;

public class FooClass implements FooInterface{
    @Override
    public void Attack() {
        System.out.println("foo class - Attack");
    }

    @Override
    public void methodA() {
        System.out.println("foo class - methodA");
    }

    @Override
    public void methodB() {
        System.out.println("foo class - methodB");
    }
}
