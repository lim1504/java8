package java_09m.interfacetest.test2;

/**
 * 인터페이스
 * - 추상메소드와 상수만 가능하다.
 * - 다중상속이 가능하다
 * - static, default 구현이 가능하다.
 * - 인스턴스를 가질 수 없다. (추상메소드)
 * - public abstract 생략이 가능하다.
 * -> 메소드 명에 주의 해야한다. 같은 메소드명 + 다른구현인 경우 문제가 발생함
 *
 * @author limmchaeseong
 * @since 2023-04-20
 * @version 1.0
 */
interface Run {
    public void run();

    String runGame(String gameName);

    public int speed(int speed);

//    public String common();
}
