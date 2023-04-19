package interfacetest.test1;

/**
 * 인터페이스 foo Test - 1
 * - 인터페이스는 다중상속이 가능하다. (다형성)
 * - 추상클래스 & static & default 접근제한자를 가진 메소드를 생성할 수 있다.'
 *
 * @author limmchaeseong
 * @since 2023-04-19
 * @version 1.0
 */
public interface TestInterface extends smile, cry{
    @Override
    default void cry() {
        System.out.println("cry");
    }

    @Override
    default void smile() {
        System.out.println("smile");
    }

    static void test(){
        System.out.println("test 호출");
    }

    void init();
}
