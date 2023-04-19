package interfacetest.test1;

public class FooTestRun {
    private static Test test; //lazy initialization
    public static void main(String[] args) {

        test = new Test();

        //구현체가 아닌 인터페이스에 구현되어있는 추상메소드 -> Test class에서 재정의
        test.init();
        //인터페이스에서 가져온 메소드 (인터페이스의 조상 인터페이스의 추상메소드) -> 하위에선 필수조건이 아님
        test.smile();
        //인터페이스에서 가져온 메소드 재정의하지 않았기 때문에 조상 인터페이스 (super) 객체 호출
        test.cry();
    }
}
