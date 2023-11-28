package java_08m.testinfo0822;

/**
 * wrapper 클래스는 기본형 정보를 클래스 정보로 감싸준다.
 * 숫자형태의 정보는 모두 공통적으로 Number 클래스를 상속받고 있다.
 * 각 형태를 형변환할 수 있는 인스턴스 정보를 제공한다.
 *
 * @author cslim
 */
public class wrapper01 {
    public static void main(String[] args) {

        int i = Integer.parseInt("100");
        long l = Long.parseLong("100");
    }
}
