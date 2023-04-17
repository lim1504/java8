package abstracttest;

public class CarPlay extends Carmap{

    @Override
    public String opendoor(String car) {
        return car + "의 문이 열렸습니다.";
    }

    @Override
    public String closedoor(String car) {
        return car + "의 문이 닫혔습니다.";
    }

    @Override
    public String move(String car, int x) {
        return car + "가" + x + "M 움직였습니다.";
    }

    @Override
    public String stop(String car, int x) {
        return car + "가" + x + "M에서 멈췄습니다.";
    }

}
