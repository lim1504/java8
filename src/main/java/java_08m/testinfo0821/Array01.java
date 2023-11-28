package java_08m.testinfo0821;

/**
 * 참조형배열
 * @author cslim
 */
public class Array01 {
    public static void main(String[] args) {
        ItemArray[] array1;
        ItemArray array2[];

        array1 = new ItemArray[5];
        array2 = new ItemArray[5];

        //배열의 개수를 넘게된다면, OutboundException 발생
        array1[0] = new ItemArray(500, "item1");
        array1[1] = new ItemArray(1000, "item2");
        array1[2] = new ItemArray(5000, "item3");

        //선언과 동시에 초기화도 가능하다.
        ItemArray[] array3 = new ItemArray[]{new ItemArray(500, "item1"), new ItemArray(500, "item1")};

    }
}
