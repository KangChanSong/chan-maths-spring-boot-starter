package com.chan;

public class ChanMathsImpl implements ChanMaths{
    @Override
    public int plus(int x, int y) {
        return x + y;
    }

    @Override
    public int minus(int x, int y) {
        return x - y;
    }

    @Override
    public int multiply(int x, int y) {
        return x * y;
    }

    @Override
    public int divide(int x, int y) {
        return x / y;
    }
}
