package java0914;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.locks.StampedLock;

/**
 * fork & join 프레임워크를 활용한 에제
 * - 무조건적으로 fork & join이 좋은 것은 아니다.
 *
 * @ author cslim
 */
public class LockEx {
    static final ForkJoinPool pool = new ForkJoinPool();

    public static void main(String[] args) {
        // 프레임워크를 활용한 예제

        long from = 1L, to = 100_000_000L; // 나눌 숫자의 범위 지정

        SumTask task = new SumTask(from , to); // 재귀함수 지정
        long start = System.currentTimeMillis();
        Long result = pool.invoke(task); // fork & join 프레임워크 실행 -> start

        System.out.println("Elapsed time (4) : " + (System.currentTimeMillis() - start));

        System.out.printf("sum of %d~%d=%d%n", from, to, result);
        System.out.println();

        // 일반 for문을 활용한 예제.
        result = 0L;
        start = System.currentTimeMillis();

        for(long i = from; i < to; i++) {
            result += i;

        }

        System.out.println("Elapsed time (1) : " + (System.currentTimeMillis() - start));
        System.out.printf("sum fo %d~%d=%d%n", from, to, result);
    }

}

class SumTask extends RecursiveTask <Long> {

    long from;
    long to;

    public SumTask(long from, long to) {
        this.from = from;
        this.to = to;
    }

    /**
     * 지속적으로 실행되는 compute 영역
     * - 나눠지지 않는 지점까지 지속 실행
     * @return
     */
    @Override
    protected Long compute() {
        long size = to - from + 1; // 배열의 사이즈 지정

        if (size <= 5) { // size가 5 이하로 내려가면 return
            return sum();
        }

        long half = (from + to) / 2; // 절반으로 나눔

        //나눠진 2부류 지정
        SumTask leftSum = new SumTask(from, half);
        SumTask rightSum = new SumTask(half + 1, to);

        // 큐 작업대에 왼쪽 정보 삽입
        // - 지속적으로 compute -> fork 과정을 내부적으로 거침
        // - 작업 스틸이 지속적으로 일어남 (작업할 내용이 없는 스레드가 작업을 뺏어감)
        leftSum.fork();
        // compute -> 지속적으로 나눔과정 (재귀 과정) 실시
        // join -> 왼쪽 정보 (작업 큐에 들어간 정보의 결과값을 기다림 - 동기식)
        return rightSum.compute() + leftSum.join();
    }

    long sum() {
        long tmp = 0L;

        for (long i = from; i < to; i++) {
            tmp += i;
        }

        return tmp;
    }
}
