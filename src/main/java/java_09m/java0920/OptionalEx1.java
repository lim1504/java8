package java_09m.java0920;

import java.util.Optional;

public class OptionalEx1 {
    public static void main(String[] args) {

        int result = Optional.of("123")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).orElse(-1);

        result = Optional.of("")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).orElse(-1);

    }
}
