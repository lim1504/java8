package java_09m.interfacetest.test3;

/**
 * 인터페이스는 객체 및 인스턴스를 가질 수 없다.
 * {}가 포함된 정보를 가질 수 없음.
 * 기본적으로 구현체에서 선언될 메소드 정보를 셋팅할 수 있음.
 */
public interface IVCR {
    public void paly();
    public void stop();
    public void reset();
    public int getCounter();
    public void setCounter(int c);
}
