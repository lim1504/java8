package java_11m.java1128;

import java.util.Arrays;

class Test1 {
    private double[] numbers;

    public Test1(double[] numbers) {
        this.numbers = numbers;
    }

    public double sum () {
        double total = 0.0;
        for(double number : numbers) {
            total += number;

        }
        return total;
    }
}

class Test2 {
    private double[] numbers = new double[10_000_000];

}

class ObjectOrientedTest {
    static final int NUM = 10_000_000;
    public static void main(String[] args) {
        double[] numbers = new double[NUM];
        Arrays.fill(numbers, 1.0);

        Test1 test = new Test1(numbers);

        long startTime = System.nanoTime();
        double sum = test.sum();
        long endTime = System.nanoTime();

        System.out.println("OOP - Sum: " + sum);
        System.out.println("OOP Time: " + (endTime - startTime) + " nanosec");
    }
}
