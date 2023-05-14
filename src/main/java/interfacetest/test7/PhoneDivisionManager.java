package interfacetest.test7;

public class PhoneDivisionManager {

    public static Divisionable divisionable(String phoneModel){
        phoneModel = phoneModel.toLowerCase();
        if(phoneModel.contains("iphone")){

           return new Iphone();
        }
        else if(phoneModel.contains("galaxy")){

            return new Galaxy();
        }
        else{

            return new EtcPhone();
        }
    }
}
