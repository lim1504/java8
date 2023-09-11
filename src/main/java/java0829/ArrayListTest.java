package java0829;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        //사이즈 명시가능
        //사이즈를 명시하지 않으면, 초기 값은 10이다.
        list1 = new ArrayList<>(5);
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(8);
        list1.add(7);
        list1.add(3);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        System.out.println("--------------------------------");
        Collections.sort(list1);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}

