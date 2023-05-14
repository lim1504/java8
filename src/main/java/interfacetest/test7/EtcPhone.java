package interfacetest.test7;

public class EtcPhone implements Divisionable{
    @Override
    public void phoneDivision(String phoneModel) {
        System.out.println(phoneModel + " 은 기타제품입니다.");
    }
}
