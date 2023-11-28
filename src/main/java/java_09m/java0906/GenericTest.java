package java_09m.java0906;

import java.util.ArrayList;

class Fruit { public String toString() {return "Fruit";}}
class Apple extends Fruit { public String toString() {return "Apple";}}
class banana extends Fruit { public String toString() {return "banana";}}

class Juice {
    String name;

    @Override
    public String toString() {
        return "Juice{" +
                "name='" + name + '\'' +
                '}';
    }

    public Juice(String name) {
        this.name = name;
    }
}
public class GenericTest {
    public static void main(String[] args) {

    }
    public static <T> void print (){

    }

}
class Box<T> {
    ArrayList<T> list = new ArrayList<>();
    void add(T item) {list.add(item);}
    T get(int index) {return list.get(index);}
    ArrayList<T> getList() {return list;}
    int size() {return list.size();}
    public String toString() {return list.toString();}

}
