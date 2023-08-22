package testinfo0822;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Set
 *
 * @author cslim
 */
public class Collection02 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("c");

        Iterator<String> it = set.iterator();

        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key);
        }

        Set<MapData> mySet = new HashSet<MapData>();
        mySet.add(new MapData("kin", 500));
        mySet.add(new MapData("lee", 1000));
        mySet.add(new MapData("goo", 5500));
        mySet.add(new MapData("koo", 700));
        mySet.add(new MapData("koo", 800));

        Iterator<MapData> it2 = mySet.iterator();

        while (it2.hasNext()) {
            MapData key = it2.next();
            System.out.println(key);
        }
    }
}

class MapData {
    private String name;
    private int price;

    public MapData(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MapData{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
