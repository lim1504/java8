package testinfo0811;

public class Person {
    String name; // 인스턴스 필드
    String address;
    boolean isVip;
    static int count = 0; // 클래스 필드

    /**
     * 인스턴스 메소드
     * @author cslim
     */
    public void printName() {
        System.out.println("내 이름은 " + name);
    }

    /**
     * 클래스 메소드
     * @author cslim
     */
    public static void printCount() {
//        System.out.println(name); static 클래스와 인스턴스 필드의 정보는 같이 사용할 수 없다. 생성 시점이 다르다.
        System.out.println("count : " + count);
    }
}
