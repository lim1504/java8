package java0920;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {

        Stream<String> strStream = Stream.of("aa", "dd", "uu", "bb", "cc", "hh");
        strStream.sorted();
        strStream.sorted(Comparator.naturalOrder());
        strStream.sorted((s1, s2) -> s1.compareTo(s2));
        strStream.sorted(String::compareTo);

        strStream.sorted(Comparator.reverseOrder());
        strStream.sorted(Comparator.<String>naturalOrder().reversed());

        strStream.sorted(String.CASE_INSENSITIVE_ORDER);
        strStream.sorted(String.CASE_INSENSITIVE_ORDER.reversed());

        Stream<File> fileStream = Stream.of(new File("Ex1.java"), new File("Ex2.java"), new File("Ex1"), new File("Ex3.txt"));

        fileStream.map(File::getName)
                .filter(s -> s.indexOf('.') != -1)
                .map(s -> s.substring(s.indexOf('.')+1))
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);

        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println);


        Stream<String[]> StrArrStream =
                Stream.of(new String[] {"abc", "def", "ghi"},
                        new String[] {"ABC", "DEF", "GHI"});

        Stream<String> strStream3 = Stream.of("ABC","DEF","WLW");
        Stream<String> strStream4 = Stream.of("abc","def","wlw");

        Stream<Stream<String>> strSumStream = Stream.of(strStream3, strStream4);

// map & flatMap 을 활용한 반환
        Stream<String> stream3 = strSumStream
                .map(s -> s.toArray(String[]::new)) // Stream<Stream<String>> -> Stream<String[]>
                .flatMap(Arrays::stream); // Stream<String[]> -> String<String>
    }
}
