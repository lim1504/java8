package java_09m.interfacetest;

/**
 * 인터페이스 구현체 작성 (class , abstract)
 * - 클래스로 작성한 경우, 구현할 인터페이스의 추상메소드는 모두 처리되어야한다.
 *
 * @author limmchaeseong
 * @since 2023-04-19
 * @version 1.0
 */
public class Fight implements Figthable{

    Figthable figth;
    public Fight(){
        this.figth = figth;
    }
    @Override
    public void attack(String unitName) {
        String a = figth.name2;
        String b = Figthable.Uint("d");
    }

    @Override
    public void move(int x, int y) {

        System.out.println("move : x: " + y + " y: " + y);
    }

}
