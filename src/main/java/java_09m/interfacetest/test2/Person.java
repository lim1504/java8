package java_09m.interfacetest.test2;

/**
 * 인터페이스
 * - 다중상속인 경우, 같은 메소드명이 있으면 어떤 조상의 메소드를 구현했는지 모호해진다.
 * - 인터페이스 구현시, 메소드 네이밍에 주의해야한다.
 *
 * @author limmchaeseong
 * @since 2023-04-20
 * @version 1.0
 */
public class Person implements Exercise{
    @Override
    public void run() {
        Exercise.super.run();
    }

    @Override
    public String runGame(String gameName) {
        return Exercise.super.runGame(gameName);
    }

    @Override
    public int speed(int speed) {
        return Exercise.super.speed(speed);
    }

    @Override
    public void work() {
        Exercise.super.work();
    }

    @Override
    public String workGame(String gameName) {
        return Exercise.super.workGame(gameName);
    }
}
