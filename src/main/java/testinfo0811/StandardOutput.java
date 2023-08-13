package testinfo0811;

/**
 * 다형성
 * 나는 힘들게, 남들은 사용하기 편하게
 * @author cslim
 */
public class StandardOutput {

    public void println(boolean a) {
        System.out.println(a);
    }

    public void println(int i) {
        System.out.println(i);
    }

    public void println(String s) {
        System.out.println(s);
    }

    public void println(double d) {
        System.out.println(d);
    }

    public static void main(String[] args) {
        StandardOutput standard = new StandardOutput();
        standard.println(100);
        standard.println("hello world");
        standard.println(false);
        standard.println(10.5);
    }
}
