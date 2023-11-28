package java_09m.java0919;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) { list.add(i);};

        //UnaryOperator<T> 요소를 받고 있는 foreach 구현 (권장되는 함수형 인터페이스)
        //매개변수와 타입의 값이 같다.
        // i는 integer로 추론이 가능하기 때문에 선언 가능하다.
        list.forEach( i -> System.out.print(i + ",") );
        System.out.println();
        //Predicate<T> 형태를 선언할 수 있고, 함수형인터페이스다.
        //return 타입은 boolean 형태
        list.removeIf(f -> f%2 == 0 || f%3 == 0);
        System.out.println(list);

        //UnaryOperator<T>
        list.replaceAll(i -> i*10);
        System.out.println(list);

        Map<String, Object> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);

        //BiConsumer<T,U> 2개의 매개변수, return type 없음
        map.forEach((k,v) -> System.out.println("key : " + k + " : " + "value : " + v));
    }
}
