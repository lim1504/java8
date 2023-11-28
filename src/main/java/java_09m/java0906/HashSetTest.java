package java_09m.java0906;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet
 * 1. 중복허용하지않음.
 * 2. 순서를 보장하지않음.
 * @author cslim
 */
public class HashSetTest {
    public static void main(String[] args) {
        Set hashSet = new HashSet<>();

        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");
        hashSet.add("5");
        hashSet.add("6");
        hashSet.add("7");
        hashSet.add("8");
        hashSet.add("9");
        hashSet.add("9");

        System.out.println(hashSet);

        Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "5"};
        Set hashSet2 = new HashSet();

        for (int i = 0; i <objArr.length; i++) {
            hashSet2.add(objArr[i]);
        }

        System.out.println(hashSet2);

        Set hashSet3 = new HashSet();

        hashSet3.add(new Person("채성", 10));
        hashSet3.add(new Person("정현", 8));
        hashSet3.add(new Person("선호", 20));
        hashSet3.add(new Person("예은", 20));
        hashSet3.add(new Person("길동", 15));
        hashSet3.add(new Person("길동", 25));

        System.out.println(hashSet3);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}