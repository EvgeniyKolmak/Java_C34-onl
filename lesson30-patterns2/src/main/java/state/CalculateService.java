package state;

import lombok.Setter;

import static state.CalculateService.Method.ADD;

@Setter
public class CalculateService {

    private Method method = ADD;

    public int calc(int a, int b) {
        return switch (method) {
            case ADD -> a + b;
            case SUB -> a - b;
            case MUL -> a * b;
            case DIV -> a / b;
        };
    }

    public enum Method {
        ADD, SUB, MUL, DIV
    }

}
