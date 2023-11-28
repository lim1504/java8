package java_09m.interfacetest.test5;

class InterfaceTest {
    public static void main(String[] args){
        /**
         * A 클래스는 User - 사용하는 곳
         * B 클래스는 Provider - 제공하는 곳
         * B가 변경되면, A는 수정되어야함.
         */
        A a = new A();
        a.methodA(new B());
    }
}
