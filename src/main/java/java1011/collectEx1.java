package java1011;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class collectEx1 {
    public static void main(String[] args) {
        //1. 스트림을 만든다.
        Stream<Student> stdStream = Stream.of(
                new Student("a"), new Student("b"),
                new Student("c"), new Student("d"));
        //2. 스트림을 가공한다.
        //2-1. 스트림 객체는 Student라는 클래스 객체, 담겨있는 getName을 활용해 이름으로만 List를 생성
        List<String> names = stdStream.map(Student::getName)
                .collect(Collectors.toList());

        //2-2. 똑같이 컬렉션을 이용한 객체 생성이지만, List, Set을 제외한 컬렉션은 toCollection 사용
        ArrayList<String> list = names.stream()
                .collect(Collectors.toCollection(ArrayList::new));

        stdStream.close();
        Stream<Student> stdStream2 = Stream.of(
                new Student("a"), new Student("b"),
                new Student("c"), new Student("d"));

        //2.3 map을 활용할 경우
        Map<String, Student> map = stdStream2
                .collect(Collectors.toMap(p -> p.getName(), p -> p));

    }
}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

