package interface2;

public class HTMLParser implements Parseable{

    @Override
    public void parse(String value) {
        System.out.println(value + "html file add");
    }
}
