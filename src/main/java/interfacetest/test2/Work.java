package interfacetest.test2;

/**
 * 인터페이스
 * - 인터페이스는 상수, 추상메소드만 지닐 수 있다. (abstract Class와 다르게 일반메소드는 가질 수 없다.)
 * - default, public 접근제어자를 가질 수 있다.
 * - public abstract 혹은 public static final을 생략할 수 있다.
 * - 다중상속이 가능하다.
 * -> 메소드 명에 주의 해야한다. 같은 메소드명 + 다른구현인 경우 문제가 발생함
 *
 * @author limmchaeseong
 * @since 2023-04-20
 * @version 1.0
 */
public interface Work {

    public void work();

    String workGame(String workgame);

    public int speed(int speed);

//    public int common();
}
