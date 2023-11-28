package java_08m.testinfo0811;

/**
 * 레버런스 변수를 초기화해주지 않은 정보에 대한 정보 출력은 에러를 도출한다. NullPointerException
 * @author cslim
 */
public class PersonTest {

    public static void main(String[] args) {
        Person t1 = new Person();
        Person t2 = new Person();

        t1.name = "홍길동";
        t1.address = "서울";
        t1.isVip = true;

        t2.name = "홍길동";
        t2.address = "서울";
        t2.isVip = true;


        System.out.println(t1.name);
        System.out.println(t1.address);
        System.out.println(t1.isVip);


        System.out.println(t2.name);
        System.out.println(t2.address.length());
        System.out.println(t2.isVip);

        System.out.println(t1.count);
        t1.count++;
        System.out.println(t2.count);
        t2.count++;
        System.out.println(t2.count);

    }
}
