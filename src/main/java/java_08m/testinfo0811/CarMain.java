package java_08m.testinfo0811;

/**
 * 다형성 메소드 오버라이딩
 * 부모는 자식을 참조할 수 있다.
 * 자식이 부모를 참조하기 위해선 명시적형변환을 사용해야한다.
 * 오버라이딩 된 메소드의 정보가 실핸된다.
 *
 * @author cslim
 */
public class CarMain {
    public static void main(String[] args) {

        Bus car = new Bus();
        car.run();

        //부모가 자식을 참조하는 건 가능
        Car car2 = new Bus();
        car2.run();

        //자식이 부모를 참조하려면, 명시적 형변환이 필요
        Bus busCar = (Bus) car2;
        busCar.run();

        Bus bus = new Bus();
        bus.run();

        SUV suv = new SUV();
        suv.run();

    }
}
