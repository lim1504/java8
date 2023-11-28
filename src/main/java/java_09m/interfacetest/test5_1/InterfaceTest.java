package java_09m.interfacetest.test5_1;

public class InterfaceTest {
    public static void main (String[] args) throws Exception {
        //A는 User
        //B, C는 Provider
        //A
        A a = new A();
        a.methodA(new C());
        a.methodA2(new C());
    }
}
