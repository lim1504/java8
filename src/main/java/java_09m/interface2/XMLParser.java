package java_09m.interface2;

public class XMLParser implements Parseable{
    @Override
    public void parse(String value) {
        System.out.println(value + "xml file add");
    }
}
