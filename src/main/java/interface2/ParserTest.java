package interface2;

/**
 * client는 소스를 변경하지 않아도 업데이트 된 결과물을 얻어볼 수 있음
 *
 * @author limmchaeseong
 * @since 2023-04-25
 * @version 1.0
 */
public class ParserTest {
    public static void main(String[] args){
        Parseable parseable = ParserManager.gerParser("XML");
        parseable.parse("document.xml");

        parseable = ParserManager.gerParser("Html");
        parseable.parse("document.html");
    }
}
