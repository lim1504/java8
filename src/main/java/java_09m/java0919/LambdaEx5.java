package java_09m.java0919;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class LambdaEx5 {
    public static void main(String[] args) {

        //메소드 참조
        Function<String, Integer> f2 = (String s) -> Integer.parseInt(s);

        Function<String, Integer> f3 = Integer::parseInt;

        BiFunction<String, String, Boolean> b = (s1, s2) -> s1.equals(s2);

        BiFunction<String, String, Boolean> b2 = String::equals;

        //함수형 인터페이스의 익명객체 선언
        Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1;
        Consumer<Integer> c = i -> System.out.println(i+", ");
        Predicate<Integer> p = i -> i%2 == 0;
        Function<Integer, Integer> f = i -> i/10*10;

        List<Integer> list = new ArrayList<Integer>();
        //1. 리스트의 임의의 신규 값 삽입
        makeRandomList(s, list);
        System.out.println(list);

        //2. 리스트에 담긴 요소중, 짝수인 정보만 출력
        printEvenNum(p, c, list);

        //3. 남아있는 요소에 연산
        List<Integer> newList = doSomething(f, list);
        System.out.println(newList);
    }

    static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
        List<T> newList = new ArrayList<T>(list.size());

        for(T i : list) {
            newList.add(f.apply(i));
        }

        return newList;
    }

    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        System.out.println("[");

        for(T i : list) {
            if (p.test(i))
                c.accept(i);
        }

        System.out.println("]");
    }

    static <T> void makeRandomList (Supplier <T> s, List<T> list) {
        for (int i = 0; i < 10; i++) {
            list.add(s.get());
        }
    }
}
