package java0829;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        ArrayListAndLinkedListTest1();
        ArrayListAndLinkedListTest2();

    }

    /**
     * 조회 시간 테스트
     *
     * ArrayList 에 비해 LinkedList 는 상당히 비효율적이다.
     *
     * @author cslim
     */
    public static void ArrayListAndLinkedListTest2 () {

        ArrayList list1 = new ArrayList(1000000);
        LinkedList list2 = new LinkedList();

        add(list1);
        add(list2);

        System.out.println("= getting test =");
        System.out.println("ArrayList : " + access(list1));
        System.out.println("LinkedList : " + access(list2));
    }

    public static void add (List list) {
        for (int i = 0; i < 100000; i++) list.add(i+"");
    }

    public static long access (List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) list.get(i);

        long end = System.currentTimeMillis();

        return end - start;
    }

    /**
     * 저장 & 삭제 테스트
     *
     * 순차 삭제 및 추가는 ArrayList가 빠름
     * 중간 삭제 및 추가는 LinkedList가 빠름
     *
     * @author cslim
     */
    public static void ArrayListAndLinkedListTest1 () {
        ArrayList list = new ArrayList<>(2000000);
        LinkedList list2 = new LinkedList<>();

        System.out.println("==adding==");
        System.out.println("ArrayList :" + add1(list));
        System.out.println("LinkedList :" + add1(list2));
        System.out.println();
        System.out.println("==중간 adding==");
        System.out.println("ArrayList :" + add2(list));
        System.out.println("LinkedList :" + add2(list2));
        System.out.println();
        System.out.println("==중간 removing==");
        System.out.println("ArrayList :" + remove2(list));
        System.out.println("LinkedList :" + remove2(list2));
        System.out.println();
        System.out.println("==removing==");
        System.out.println("ArrayList :" + remove1(list));
        System.out.println("LinkedList :" + remove1(list2));
    }

    public static long add1 (List list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            list.add(i+"");
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long add2 (List list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            list.add(500, "X");
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long remove1 (List list) {
        long start = System.currentTimeMillis();

        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long remove2 (List list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }
}
