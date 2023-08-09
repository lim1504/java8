package variable;

import java.util.Map;

/***
 * 변수 예제 생성 학습
 *
 * @since 1.0.0
 * @author cslim
 */
public class VariableTest {
    //Lazy initialization simple example
    static int data1;
    static int data2;
    static Map<String, Object> map;
    public static void main(String[] args) {
        int a = 0;
        Integer a2 = 0;
        boolean b = false;
        Long c = 0L;
        long c2 = 0;
        long c3 = 0L;
        String name = "";

        String[] values = new String[5];



        for (int i = 0; i < 5; i++) {
            lazyVariableTest();
        }

    }

    private static void lazyVariableTest() {

        data1 = 100;
        data2 = 200;

        System.out.println(data1 + data2);
    }

}
