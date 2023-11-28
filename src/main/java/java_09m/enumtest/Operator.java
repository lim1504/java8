package java_09m.enumtest;

import java.util.function.BiFunction;

public enum Operator {
    PLUS("덧셈", (a, b) -> (a + b)),
    MINUS("뺄셈", (a, b) -> (a - b)),
    MULTIPLY("곱셈", (a, b) -> (a * b)),
    DIVIDE("나눗셈", (a, b) -> (a / b));

    private final String name;
    private final BiFunction<Double, Double, Double> biFunction;

    Operator(String name, BiFunction<Double, Double, Double> biFunction) {
        this.name = name;
        this.biFunction = biFunction;
    }

    public Double calculate(double a, double b) {
        return this.biFunction.apply(a, b);
    }
}
