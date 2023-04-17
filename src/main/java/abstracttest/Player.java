package abstracttest;

/**
 * 추상 클래스
 * - 추상메소드와 일반메소드 모두 구현 가능
 * - 상속으로 확장 가능
 * - 공통기능을 추상화
 * - 인스턴스 생성 불가 (추상 메소드) | - 인스턴스를 가질 수도 있음 (일반 메소드)
 * - 멤버변수와 메서드도 가질 수 있음
 * - 구현체 (구현하고자하는 곳)에서 기능 구현
 * - 다양한 클래스에서 상속받아 사용가능 (다형성)
 *
 * @author limmchaeseong
 * @Since 2023-04-17
 * @version 1.0
 */
abstract class Player {

    boolean bool;
    int cuurentPos;

    Player(){
        this.bool = false;
        this.cuurentPos = 0;
    }

    //구현이 강제되는 추상메소드 -> 인스턴스(객체)를 가질 수 없음 | {} 없음
    abstract void play(int pos);
    abstract void stop();

    //구현이 강제되지않은 메소드 -> 인스턴스 구현 가능 | {} 있음
    void going(int pos){}

    void go(){}

    void play(){
        play(cuurentPos);
    }

    void pause(){
        if(bool){
            bool = false;
        }
        else {
            bool = true;
            stop();
        }
    }
}
