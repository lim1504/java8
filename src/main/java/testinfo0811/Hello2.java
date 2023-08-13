package testinfo0811;

/**
 * 클래스의 static 정보의 실행순서 나열
 *
 * static block이 먼저 실행된 후, main static이 실행된다.
 * 따라서, main메소드보다 먼저 무엇인가 처리할 수 있다.
 * @author cslim
 */
public class Hello2 {
    static int i;
    static {
        i = 500;
        System.out.println("static block");
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
