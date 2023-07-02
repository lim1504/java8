package streamStudy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class streamOne {

    public static void main(String[] args) {
        //예제1. 임의의 스트림 데이터 생성
        List<Map<String, Object>> dataList = new ArrayList<>();

        // Creating sample data
        Map<String, Object> data1 = new HashMap<>();
        data1.put("id", 1);
        data1.put("name", "John");
        data1.put("age", 25);
        data1.put("salary", 50000.0);
        dataList.add(data1);

        Map<String, Object> data2 = new HashMap<>();
        data2.put("id", 2);
        data2.put("name", "Jane");
        data2.put("age", 30);
        data2.put("salary", 60000.0);
        dataList.add(data2);

        Map<String, Object> data3 = new HashMap<>();
        data3.put("id", 3);
        data3.put("name", "Alice");
        data3.put("age", 35);
        data3.put("salary", 70000.0);
        dataList.add(data3);

        Map<String, Object> data4 = new HashMap<>();
        data4.put("id", 4);
        data4.put("name", "Bee");
        data4.put("age", 40);
        data4.put("salary", 70000.0);
        dataList.add(data4);

        //1) 스트림 직접생성 - Builder
        Stream<String> stream =Stream.<String> builder().add("a").add("b").add("c").add("d").build();

        //2) 스트림 데이터 가공
            // map
            // filter
            // sorting
            // itera

        //2-1) map
            //스트림의 각 요소를 변환하는 일종의 가공과정을 거칠 수 있게 해준다.
            //문자열 대문자 변환, 특정 속성값 추출
            //데이터 convert
            //계산 수행
            //사용자가 정의한 객체로의 커스텀 데이터 반환 등..
        List<String> list = dataList.stream().map(data -> (String) data.get("name")).collect(Collectors.toList());

        List<String> lis2 = dataList.stream().map(data -> ((String) data.get("name")).toUpperCase()).collect(Collectors.toList());

        List<String> list3 = dataList.stream().map(data -> (data.get("age").toString())).collect(Collectors.toList());

        double ageAvg = dataList.stream().mapToInt(data -> (int)data.get("age")).average().orElse(0.0);
        int ageSum = dataList.stream().mapToInt(data -> (int)data.get("age")).sum();

//        List<Map<String, Object>> customMap = new ArrayList<>();

        Stream<Map<String, Object>> streamOne = dataList.stream()
                .map(data -> {
                    Map<String, Object> inMap = new HashMap<>();
                    inMap.put("name", data.get("name"));
                    inMap.put("age", data.get("age"));
                    return inMap;
                })
                .collect(Collectors.toList())
                .stream();


        Stream<Map<String, Object>> streamTwo = dataList.stream()
                .map(data -> {
                    Map<String, Object> inMap = new HashMap<>();
                    inMap.put("name", data.get("name"));
                    inMap.put("age", data.get("age"));
                    return inMap;
                })
                .filter(data -> (int) data.get("age") >= 30)
                .filter(data -> ((String) data.get("name")).contains("A"))
                .collect(Collectors.toList())
                .stream();


        Stream<Map<String, Object>> streamThr = dataList.stream()
                .map(data -> {
                    Map<String, Object> inMap = new HashMap<>();
                    inMap.put("name", data.get("name"));
                    inMap.put("age", data.get("age"));
                    return inMap;
                })
                .filter(data -> (int) data.get("age") >= 30)
                .sorted(Comparator.comparing(data -> (String) data.get("name")))
                .collect(Collectors.toList())
                .stream();

        Optional<Map<String, Object>> streamData =  dataList.stream().filter(data -> (int) data.get("age") > 30).findFirst();

        int a = 1;

    }
}
