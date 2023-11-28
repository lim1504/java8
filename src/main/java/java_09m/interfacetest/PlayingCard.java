package java_09m.interfacetest;

/**
 * 인터페이스
 * - 일종의 추상클래스이다.
 * - 추상메소드만 구성이 가능
 * - 인터페이스간 다중상속이 가능하다
 * - 인터페이스 안에 있는 모든 추상메소드는 반드시 구현되야함
 * - 표준화와 다형성 제공에 도움
 * - 모든 멤버변수에는 public static final 이 포함되어야 하고, 생략이 가능
 * - 모든 추상메소드는 public abstract 이어야 하고, 생략이 가능
 *
 * - java 8 이상부터는 default 접근제한자와, static 으로 선언 가능
 * -> default 는 구현체에서 재정의
 * -> static 은 클래스 이름으로 직접 호출이 가능함.
 *
 * @author limmchaeseong
 * @Since 2023-04-19
 * @version 1.0
 */
public interface PlayingCard {
    public static final int SPADE = 4;
    final int DIAMOND = 3;
    static int HEART = 2;
    int CLOVER = 1;

    public abstract String getCardNumber();
    String getCardKind();

    String cardName(String name);

    static void init(){
        System.out.println("init");
    }
}
