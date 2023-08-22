package testinfo0822;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map
 *
 * @author cslim
 */
public class Collection03 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("k1", "123");
        map.put("k2", "1345a");
        map.put("k3", "12333");
        map.put("k3", "21333");

        Set<String> keySet = map.keySet();

        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = (String) map.get(key);

            System.out.println("key: " + key + " :  value: " + value);
        }
    }
}
