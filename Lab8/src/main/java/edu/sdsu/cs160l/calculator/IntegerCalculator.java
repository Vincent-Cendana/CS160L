package edu.sdsu.cs160l.calculator;

public class IntegerCalculator implements Calculator<Integer> {
    @Override
    public Integer add(Integer a, Integer b) {
        return a+b;
    }

    @Override
    public Integer sub(Integer a, Integer b) {
        return a-b;
    }

    @Override
    public Integer div(Integer a, Integer b) throws ArithmeticException {
        return a/b;
    }

    @Override
    public Integer mul(Integer a, Integer b) {
        return a*b;
    }
}
