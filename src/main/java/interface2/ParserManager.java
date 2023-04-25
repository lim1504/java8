package interface2;

/**
 * server 측에서 변경시, 교체 및 추가로 사용자에게 새로운 기능을 추가해줄 수 있음. -> 확장성
 *
 * @author limmchaeseong
 * @since  2023-04-25
 * @version 1.0
 */
public class ParserManager {
    public static Parseable gerParser(String type){
        type = type.toUpperCase();
        if(type.equals("XML")){
            return new NewXMLParser();
        }
        else{
            Parseable p = new HTMLParser();
            return p;
        }
    }
}
