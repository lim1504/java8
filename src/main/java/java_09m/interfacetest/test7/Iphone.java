package java_09m.interfacetest.test7;

public class Iphone implements Divisionable{
    @Override
    public void phoneDivision(String phoneModel) {
        System.out.println(phoneModel+"은 apple 제품입니다.");
    }
}
