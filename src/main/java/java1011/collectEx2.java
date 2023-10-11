package java1011;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class collectEx2 {
    public static void main(String[] args) {
        Stream<Person> personStream = Stream.of(
                new Person("a", 10), new Person("b", 15),
                new Person("c", 20), new Person("d", 45));

        long count = personStream.count();
        long count2 = personStream.collect(counting());

        long totalAge = personStream.mapToInt(Person::getAge).sum();
        long totalScore = personStream.collect(summingInt(Person::getAge));

        IntSummaryStatistics stat = personStream.mapToInt(Person::getAge).summaryStatistics();
        IntSummaryStatistics stat2 = personStream.collect(summarizingInt(Person::getAge));
    }
}

class Person {

    String name;

    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
