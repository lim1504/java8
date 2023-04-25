package interface2;

public class NewXMLParser implements Parseable{
    @Override
    public void parse(String value) {
        System.out.println(value + " new xml file add");
    }
}
