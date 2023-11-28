package java_09m.interfacetest.test2;

/**
 * 인터페이스 다중상속 주의점
 * - 같은 메소드 명을 지정한 경우, 다중상속을 받으면 어떤 인터페이스 메소드를 상속박은 것인지 알 수 없다.
 */
public interface Exercise extends Run, Work{
    @Override
    default void run() {

    }

    @Override
    default String runGame(String gameName) {
        return gameName;
    }

    @Override
    default int speed(int speed) {
        return 0;
    }

    @Override
    default void work() {

    }

    @Override
    default String workGame(String gameName) {
        return gameName;
    }
}
