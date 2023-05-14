package interfacetest.test6;

public class InterfaceTest {
    public static void main(String[] args) {
        FooInterface foo = new FooClass();
        foo.methodA();
        foo.methodB();
        foo.Attack();
    }

    FooInterface fooMethod() {
        return new FooClass();
    }
}
