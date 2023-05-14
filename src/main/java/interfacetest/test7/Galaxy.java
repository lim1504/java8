package interfacetest.test7;

public class Galaxy implements Divisionable{
    @Override
    public void phoneDivision(String phoneModel) {
        System.out.println(phoneModel +" 은 삼성 제품입니다.");
    }
}
