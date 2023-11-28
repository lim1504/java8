package java_08m.java0829;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Set<String> set = new HashSet<String>();


        //0830 merge 예제
        Map<String, Integer> map = new HashMap<>();
        map.put("foo", 1);
        map.put("bar", 2);
        map.put("baz", 3);

        map.forEach((key, value) -> System.out.println(key + "=" + value));
        System.out.println("--------------------------------");
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("foo", 300);
        map2.put("bar", 200);
        map2.put("baz", 3);
        map2.put("new", 5);

        //putAll 처럼 작동 -> map 합치기
        map2.forEach((key, value) -> map.merge(key, value, (v1, v2) -> v2));

        //중복된 Key 끼리 값을 sum 과 같은 데이터 연산도 가능.
        map2.forEach((key, value) -> map.merge(key, value, Integer::sum));

        map.forEach((key, value) -> System.out.println(key + "=" + value));
    }
}
