package java_08m.testinfo0822;

/**
 * 해당되는 Object의 타입을 명시해줘야 한다.
 */
public class ObjectBoxMain {
    public static void main(String[] args) {
        ObjectBox box = new ObjectBox();
        box.setObject("kim");
        String str = (String) box.getObject();

        box.setObject(new Integer(5));
        Integer i = (Integer) box.getObject();
    }
}
