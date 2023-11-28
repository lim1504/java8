package abstacttest.car;

import java_09m.abstracttest.CarPlay;
import org.junit.jupiter.api.Test;

public class cartest {

    final String carName1 = "제네시스";
    final String carName2 = "볼보X90";

    final String carName3 = "마티즈";

    @Test
    public static void main(String[] args){
        String carName = "제네시스";
        CarPlay carPlay = new CarPlay();

        System.out.println(carPlay.opendoor(carName));
        System.out.println(carPlay.closedoor(carName));
        System.out.println(carPlay.move(carName, 10));
        System.out.println(carPlay.stop(carName, 15));

    }



}
