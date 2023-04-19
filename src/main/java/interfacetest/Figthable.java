package interfacetest;

/**
 * 인터페이스 상속
 * - 각 각 조상인터페이스에서 상속받은 추상메소드를 지닌다.
 *
 * @author limmchaeseong
 * @since 2023-04-19
 * @version 1.0
 */
interface Figthable extends Movable, Attackable{

    public static final String name2 = "name";
    static String Uint(String name){
        return name;
    }
}
