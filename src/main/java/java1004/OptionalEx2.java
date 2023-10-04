package java1004;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalEx2 {
    public static void main(String[] args) {
        Optional<String> val = Optional.of("foo");
//        Optional<String> val2 = Optional.of(null);
        Optional<String> val2 = Optional.ofNullable(null);
        Optional<String> val3 = Optional.of(new String("bar"));

//        Optional<String> val4 = Optional.of("55");
        Optional<String> val4 = Optional.ofNullable(null);
        String other = "44";
        String a = val4.orElseGet(() -> "4");
        System.out.println("a : " + a);
//        val4.orElseThrow(IllegalAccessError::new);

        Optional<Integer> val5 = Optional.ofNullable(0);

        int val5_e = val5.get();
        val5.orElse(3);

        val5.ifPresent(System.out::println);

        Map<String, Object> map2 = new HashMap<>();
        Map<String, Object> mapData = new HashMap<>();
        mapData.put("foo", 1);
        mapData.put("bar", 2);
        mapData.put("dd", 3);
        mapData.put("cc", 4);

        if (Optional.of(mapData).isPresent()) {

            Optional.of(mapData).ifPresent(m -> map2.putAll(m));

            Optional.of(map2).ifPresent(System.out::println);
            mapData.clear();

            Optional.of(mapData).ifPresent(System.out::println);
        }

    }
}
