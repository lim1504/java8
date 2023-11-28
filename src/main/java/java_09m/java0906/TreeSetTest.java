package java_09m.java0906;

import javax.swing.tree.TreeNode;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet 예제
 * 1. 출력시 정렬할 필요가 없음.
 * 2. 중복허용,
 */
public class TreeSetTest {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }

        System.out.println(set);

        TreeSet set2 = new TreeSet();

        String from = "a";
        String to = "d";

        set2.add("abc");
        set2.add("bd");
        set2.add("car");
        set2.add("dead");
        set2.add("roll");
        set2.add("zzz");
        set2.add("disco");
        set2.add("flower");

        System.out.println(set2);
        System.out.println(set2.subSet("a", "d"));
        System.out.println(set2.subSet("a", "b"));
        System.out.println(set2.subSet("a", "z"));

        System.out.println("c보다 작은 값 : " + set2.headSet("c"));
        System.out.println("c보다 큰 값 : " + set2.tailSet("c"));

        TreeSet set3 = new TreeSet();
        int[] number = {80, 95, 50, 35, 45, 65, 10, 100};

        for (int i = 0; i < number.length; i++) {

            set3.add(number[i]);
        }

        System.out.println("50보다 작은 값 : " + set2.headSet(50));
        System.out.println("50보다 큰 값 : " + set2.tailSet(50));

    }
}
