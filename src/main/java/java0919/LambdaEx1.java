package java0919;

@FunctionalInterface
interface MyFunction {
    void run();
}
public class LambdaEx1 {
    /**
     * 매개변수 타입으로 함수형인터페이스 선언
     * @param f
     */
    static void execute (MyFunction f) {
        f.run();
    }

    static MyFunction getMyFunction() {
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        //1. 람다식으로 run() 구현 예제
        MyFunction f1 = () -> System.out.println("f1.run()");

        //2. 익명 클래스로 run() 구현 예제
        MyFunction f2 = new MyFunction() {
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();
        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run()"));

        MyFunction f4 = (MyFunction) (() -> {
        });
//        Object o = (Object) (() -> {}); 형변환 불가
    }
}
