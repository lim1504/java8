package java_11m.java1128;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class GenericsTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
    }
}

class GItem<T> {
    T gItem;

    void setGItem(T gItem) { this.gItem = gItem; }
    T getGItem() { return this.gItem; }
}
