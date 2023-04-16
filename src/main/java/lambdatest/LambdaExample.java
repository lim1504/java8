package lambdatest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * 람다 표현식 정리하는 예제
 * 람다란?
 *  - 자바 8에서 도입된 함수형 프로그래밍을 지원하는 기능
 *  - 간결한 문법으로 익명함수를 사용할 수 있게 해줌
 *  - 코드길이를 줄이고, 가독성 향상에 도움이 됨.
 *  - (단, 너무 과도한 람다식 사용은 오히려 가독성을 해침)
 *  [특징]
 *  - 인터페이스 단일 추상메소드를 구현
 *  - 함수형 인터페이스의 메소드를 호출
 *  - 람다 표현식을 인자로 전달하는 메소드 호출
 *  - 람다 표현식을 반환값으로 사용
 *  - 값을 바로 반환 (if문 등.. 명령문 포함 불가)
 *
 *  [구현]
 *  1. 자바 Collection 을 활용해, 람다식 구현
 *      - 의문점
 *          1. 단일 추상메소드를 가지고 있어야하는 - 함수형인터페이스의 조건
 *             ? : forEach 내부의 매개변수로 Consumer를 포함하고 있는데,
 *                 Consumer interface 내부에는 accept와 andThen이 구현되어 있었음
 *                 그렇다면 Consumer는 단일 추상 메소드를 구현하고 있는 인터페이스에 위배되지않나?
 *
 *             ! : 조사해본 결과, 함수형 인터페이스의 조건에 Default 메소드는 포함되지 않는다.
 *                 andThen 메소드는 두개의 Consumer 인터페이스를 사용하는데 도움을 주는
 *                 '디폴트 메소드'이기 때문에 조건에 포함되지 않는다.
 *                 [미포함 조건]
 *                 1. 인터페이스 내에서 이미 구현되어 있는 메소드
 *                 2. 인터페이스의 기본동작을 제공하거나 기존 인터페이스의 확장기능을 제공할 경우s
 *
 *  2. Stream 을 활용한 람다식 구현
 *      - filter 메소드 또한 매개변수로 포함하고 있는 Predicate 인터페이스는 test 라는 하나의 추상 메소드를 가진다.
 *
 * @version 1.0
 * @since 2023
 * @author cslim
 */
public class LambdaExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("철수");
        list.add("미영");
        list.add("다슬");
        list.add("영철");
        list.add("채진");
        list.add("수민");
        list.add("뭉이");

//      1. Collection 을 활용한 람다 예제
        list.forEach((name) -> {
            System.out.println(name);
        });

        System.out.println("================================");

        Consumer<String> listdata = (data) -> {
            System.out.println(data);
        };
        list.forEach(listdata);

        System.out.println("================================");

//      2. stream 을 활용한 람다 예제
        list.stream()
                .filter(name -> name.contains("채"))
                .forEach(name -> System.out.println(name));
    }
}