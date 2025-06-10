package strategy;

import java.util.function.BiFunction;

public class CalculateService {

    public int calc(int a, int b, BiFunction<Integer, Integer, Integer> operation) {
        return operation.apply(a, b);
    }

}
