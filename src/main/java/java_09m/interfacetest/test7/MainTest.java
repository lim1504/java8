package java_09m.interfacetest.test7;

public class MainTest {
    public static void main(String[] args) throws Exception {
        String phoneModel = "galaxy23";
        Divisionable division = PhoneDivisionManager.divisionable(phoneModel);
        division.phoneDivision(phoneModel);
    }
}
