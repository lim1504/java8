package java1011;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class collectEx4 {
    public static void main(String[] args) {
        //1. Stream 객체 생성
        Stream<MiddleStudent> stream = Stream.of(
                new MiddleStudent("a", true, 1, 1, 100),
                new MiddleStudent("b", false, 1, 1, 150),
                new MiddleStudent("c", true, 1, 1, 200),
                new MiddleStudent("d", true, 1, 1, 250),
                new MiddleStudent("e", false, 1, 2, 170),
                new MiddleStudent("f", true, 1, 2, 280),
                new MiddleStudent("g", false, 1, 2, 300),
                new MiddleStudent("h", true, 1, 2, 215),
                new MiddleStudent("i", true, 1, 3, 230),
                new MiddleStudent("j", false, 1, 3, 270),
                new MiddleStudent("k", true, 1, 3, 180),
                new MiddleStudent("l", false, 1, 3, 230),
                new MiddleStudent("n", true, 1, 4, 90),
                new MiddleStudent("m", false, 1, 4, 260),
                new MiddleStudent("o", true, 1, 4, 240),
                new MiddleStudent("p", true, 1, 4, 276)
        );
        //2. patitioningBy 분류

        //2-1. 성별분할
        Map<Boolean, List<MiddleStudent>> students = stream.collect(partitioningBy(MiddleStudent::isMale));
        List<MiddleStudent> man = students.get(true);
        List<MiddleStudent> wom = students.get(false);

        //2-2. 남학생수와 여학생 수
        Map<Boolean, Long> studentsCnt = stream.collect(partitioningBy(MiddleStudent::isMale, counting()));

        Long manCnt = studentsCnt.get(true);
        Long wonCnt = studentsCnt.get(false);

        //2-3. 남자 & 여자 각 전체 1등
        Map<Boolean, Optional<MiddleStudent>> studentMaxScore = stream
                .collect(partitioningBy(MiddleStudent::isMale,
                        maxBy(comparingInt(MiddleStudent::getScore))));

        Optional<MiddleStudent> manResult = studentMaxScore.get(true);
        Optional<MiddleStudent> wonResult = studentMaxScore.get(false);

        //2-4. 170점 이하 사람들은 불합격 처리하고, 각 성별로 구분
        Map<Boolean, Map<Boolean, List<MiddleStudent>>> boolStudent = stream
                .collect(
                        partitioningBy(MiddleStudent::isMale,
                                partitioningBy(s -> s.getScore() < 150))
                );

        List<MiddleStudent> getMan = boolStudent.get(true).get(true);
        List<MiddleStudent> getWon = boolStudent.get(false).get(false);

        //3. groupingBy()

        //3-1. 일반적인 분할.
        Map<Integer, List<MiddleStudent>> ban = stream
                .collect(groupingBy(MiddleStudent::getBan)); //toList 생략 가능 (List , Set이 아닌 경우 toCollection 사용)

        //3-2. 성적순 등급을 그룹화

        Map<MiddleStudent.Level, Long> LevelCnt = stream
                .collect(groupingBy(
                        s -> {
                            if (s.getScore() >= 200) return MiddleStudent.Level.High;
                            else if (s.getScore() >= 100) return MiddleStudent.Level.Mid;
                            else return MiddleStudent.Level.Low;
                        }, counting()
                ));

        //3-3. 학년별 반별 1등 출력
        Map<Integer, Map<Integer, MiddleStudent>> top = stream
                .collect(groupingBy(MiddleStudent::getHak,
                        groupingBy(MiddleStudent::getBan,
                                collectingAndThen(
                                        maxBy(comparingInt(MiddleStudent::getScore)),
                                        Optional::get)
                        )));


    }
}

class MiddleStudent {
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    public MiddleStudent(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %d학년 %d반, %3d점]", name, isMale ? "남" : "여", hak, ban, score);
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }

    public int getHak() {
        return hak;
    }

    public int getBan() {
        return ban;
    }

    public int getScore() {
        return score;
    }

    enum Level {High, Mid, Low};
}


