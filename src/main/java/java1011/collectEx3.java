package java1011;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.reducing;

public class collectEx3 {
    public static void main(String[] args) {
        //통계 산출시 reduce를 활용.
        IntStream intStream = new Random().ints(1, 46).distinct().limit(6);

        OptionalInt max = intStream.reduce(Integer::max);
        Optional<Integer> max2 = intStream.boxed().collect(reducing(Integer::max));

        long sum = intStream.reduce(0, (a,b) -> a + b);
        long sum2 = intStream.boxed().collect(reducing(0, (a,b) -> a + b));

    }
}
