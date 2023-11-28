package java_09m.java0906;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest2 {
    public static void main(String[] args) {
        Set set = new HashSet();

        set.add(new String("abc"));
        set.add(new String("abc"));
        set.add(new Person2("David", 10));
        set.add(new Person2("David", 15));

        System.out.println(set);

        Set set2 = new HashSet();
        Set set3 = new HashSet();

        //같은 객체끼리는 비교값이 같아야하며, hashCode 도 동일하다.
        //-> 단, 실행할때마다 hashCode 값은 바뀔 수 있다.
        set2.add(new Person2("David", 10));
        set3.add(new Person2("David", 10));

        boolean bool = set2.equals(set3);

        System.out.println(bool);
        System.out.println(set2.hashCode());
        System.out.println(set3.hashCode());
    }
}

class Person2 {

    String name;
    int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if(o instanceof Person2) {
            Person2 that = (Person2) o;
            return name.equals(that.name) && age == that.age;
        }

        return false;
    }

    @Override
    public int hashCode() {

        return (name+age).hashCode();
    }
}