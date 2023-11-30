package java_11m.java1129;

import java.util.ArrayList;

class GenericsTest {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();
        Box<Grape> box2 = new Box<>();
        Box<Fruit> box3 = new Box<>();

        box3.add(new Apple());
        box3.add(new Grape());

//        Box<Toy> box4 = new Box<>();

        Delivery.<Fruit>going(box3);

        Box<? extends Fruit> fruitBox = new Box<Fruit>();

        Box<? extends Fruit> appleBox = new Box<Apple>();

        Box<? extends Fruit> grapeBox = new Box<Grape>();
    }
}

class Box<T extends Fruit & Boxing> {
    ArrayList list = new ArrayList<>();

    void add(T item) {list.add(item);}
    T get(int index) {return (T) list.get(index);}

    ArrayList<T> getList() {return list;}
    int size() {return list.size();}

    public String toString() {return list.toString();}
}

class Apple extends Fruit implements Boxing {
    @Override
    public String toString() {
        return "A";
    }
}

class Grape extends Fruit implements Boxing {
    @Override
    public String toString() {
        return "G";
    }
}

class Toy {

}

interface Boxing {
    void boxing();

}

class Fruit implements Boxing {
    public String toString() {return "F";}

    @Override
    public void boxing() {

    }
}

class Delivery {
    static <T extends Fruit> Truck going (Box<T> box) {
        String tmpList = "";
        for(Fruit fruit : box.getList()) {
            tmpList += fruit.toString() + " ";
        }
        return new Truck(tmpList);
    }
//    static Truck going (Box<Apple> box) {
//        String tmpList = "";
//        for(Fruit fruit : box.getList()) {
//            tmpList += fruit.toString() + " ";
//        }
//        return new Truck(tmpList);
//    }
}

class Truck {
    String name;
    public Truck(String name) {
        this.name = name;
    }
}

