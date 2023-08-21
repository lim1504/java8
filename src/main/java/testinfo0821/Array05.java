package testinfo0821;

import java.util.Arrays;

/**
 * Array sort 정렬
 * @author cslim
 */
public class Array05 {
    public static void main(String[] args) {
        Item[] array1 = new Item[5];

        //배열의 개수를 넘게된다면, OutboundException 발생
        array1[0] = new Item("a", 500);
        array1[1] = new Item("d", 350);
        array1[2] = new Item("k", 500);
        array1[3] = new Item("c", 6000);
        array1[4] = new Item("s", 2200);

        Arrays.sort(array1);

        for (Item item : array1) {
            System.out.println(item);
        }
    }
}
