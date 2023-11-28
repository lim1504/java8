package interfacetest;

import java_09m.interfacetest.test2.Person;
import java_09m.interfacetest.test3.IVCR;
import java_09m.interfacetest.test3.Tvcr;

public class Test2 {
    static Person person; //lazy initialization
    static Tvcr tvcr;
    public static void main(String[] args){
        person = new Person();

        person.speed(100);
        String runGameName = person.runGame("술래잡기");
        String workGameName = person.workGame("경보");

        System.out.println(runGameName + " " + workGameName);

//        인터페이스 다형성에 기반함.
//        왜 이러한 구문이 가능한가?
//        -> 보통 상식으로 자식은 부모의 요소를 사용할 수 있고, 부모는 자식의 요소를 사용하는 것이 불가하다.
//        인터페이스의 다형성을 활용한 사례이다.
//        인터페이스를 구현한 구현체는 모든 인터페이스의 추상메소드를 구현해야한다.
//        따라서 조상 인터페이스는 구현체를 참조변수로 참조하는 것이 가능한 것이다. (클래스 - 클래스간의 관계에선 성립 불가)
        IVCR ivcr = (IVCR) new Tvcr();

    }
}
