package interfacetest.test3;

/**
 * 인터페이스
 * - 다중상속의 문제점을 해결하고, 클래스의 다중상속 불가 문제를 해결한 다형성을 이용한 응용방식 예제
 * - Vcr 클래스가 가지고 있는 기능을 사용하기위해, IVCR이라는 VCR 메소드를 가지고있는 인터페이스를 생성
 * - 해등 인터페이스와 VCR을 활용해 인터페이스의 추상메소드 기능 + 클래스의 구현기능을 효과적으로 사용할 수 있음
 *
 * @author limmchaeseong
 * @since 2023-04-20
 * @version 1.0
 */
public class Tvcr extends Tv implements IVCR{
    Vcr vcr = new Vcr();
    @Override
    public void paly() {
        vcr.play();
    }

    @Override
    public void stop() {
        vcr.stop();
    }

    @Override
    public void reset() {
        vcr.reset();
    }

    @Override
    public int getCounter() {
        return vcr.getCounter();
    }

    @Override
    public void setCounter(int c) {
        vcr.setCounter(c);
    }
}
