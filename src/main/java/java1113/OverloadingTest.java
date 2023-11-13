package java1113;

import testinfo0811.Car;

public class OverloadingTest {

    public static void main(String[] args) {
        CarTest car = new CarTest();

        String test1 = car.carInfo("sorento");
        String test2 = car.carInfo("sorento", "XR-123");
        String test3 = car.carInfo("sorento", "XR-123", "KR");
        String test4 = car.carInfo("sorento", 12345, "CN");
        int test5 = car.carInfo(12345);

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
    }


}

class CarTest {
    public String carInfo (String modelName) {
        return modelName;
    }

    public String carInfo (String modelName, String modelNumber) {

        return modelName + "/" + modelNumber;
    }

    public String carInfo (String modelName, String modelNumber, String nationalNumber) {

        return modelName + "/" + modelNumber + "/" + nationalNumber;
    }

    public String carInfo (String modelName, int modelNumber, String nationalNumber) {

        return modelName + "/" + modelNumber + "/" + nationalNumber;
    }

    public int carInfo (int modelNumber) {

        return modelNumber;
    }
}

class Test2 {

    public int add (int a, int b) {

        return a + b;
    }

    public long add (long x, long y) {

        return x + y;
    }
}
