package java_09m.interfacetest.test1;

/**
 * 인터페이스 구현체 foo Test - 1
 * - 인터페이스 구현체를 구현하기 위해서는 인터페이스를 implements 받아야한다.
 * - 해당 인터페이스에 구현되어있는 추상메소드는 반드시 구현되야하는 (필수) 사항.
 * - 해당 인터페이스가 어떤 인터페이스를 추가적으로 상속받았던 간에 해당항목은 필수가 아닌 (선택) 사항.
 *
 * @author limmchaeseong
 * @since 2023-04-19
 * @version 1.0
 */
public class Test implements TestInterface{
    //필수
    @Override
    public void init() {
        System.out.println("Test class init");
    }

    //선택
    @Override
    public void cry() {
        //구현한 인터페이스 내부의 override 된 객체 정보를 가져온다.
        TestInterface.super.cry();
    }

    //선택
    @Override
    public void smile() {
        System.out.println("Test class smile");
    }
}
