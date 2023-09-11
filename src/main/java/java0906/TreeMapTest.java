package java0906;

import java.util.*;

/**
 * TreeMap & HashMap Test
 *
 * @author cslim
 */
public class TreeMapTest {
    public static void main(String[] args) {
        String[] data = {"A", "B", "K", "K", "D", "A", "Z", "D", "K"};

        TreeMap map = new TreeMap();

        for(int i=0; i<data.length; i++) {
            if(map.containsKey(data[i])) {
                Integer value = (Integer)map.get(data[i]);
                map.put(data[i], new Integer(value.intValue() + 1));
            } else {
                map.put(data[i], new Integer(1));
            }
        }

        Iterator it = map.entrySet().iterator();

        System.out.println("== 기본정렬 ==");
        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int value = ((Integer) entry.getValue()).intValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
        }
        System.out.println();

        Set set = map.entrySet();
        List list = new ArrayList(set);


        Collections.sort(list, new ValueComparator());

        it = list.iterator();
        System.out.println(" == 값이 큰것부터 정렬 ==");

        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int value = ((Integer)entry.getValue()).intValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
        }
    }

    private static Object printBar(char s, int value) {
        char[] bar = new char[value];

        for (int i = 0; i < bar.length; i++) {
            bar[i] = s;
        }

        return new String(bar);
    }

    /**
     * 정렬
     */
    static class ValueComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
                Map.Entry e1 = (Map.Entry) o1;
                Map.Entry e2 = (Map.Entry) o2;

                int v1 = ((Integer)e1.getValue()).intValue();
                int v2 = ((Integer)e2.getValue()).intValue();

                return v2 - v1;
            }

            return -1;
        }
    }
}
