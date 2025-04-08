package com.lesson16.interf;

import com.lesson16.MathService;

public class MultMathService implements MathService {

    @Override
    public int calc(int value1, int value2) {
        return value1 * value2;
    }

}
