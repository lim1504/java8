package java_09m.interfacetest.test3;

/**
 * 재생 정복 담긴 클래스 생성
 *
 */
public class Vcr {
    protected int counter;

    public void play() {System.out.println("play~");};

    public void stop() {System.out.println("stop~");};

    public void reset() {counter = 0;};

    public int getCounter(){return counter;};

    public void setCounter(int counter) {this.counter = counter;};
}

