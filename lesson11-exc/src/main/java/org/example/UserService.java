package org.example;

public class UserService {

    public int sum(int a, int b) throws NumberWrongException, RuntimeException {

        if (a < 0) {
            throw new NumberWrongException(a);
        }

        if (b < 0) {
            throw new NumberWrongException(b);
        }

        return a + b;

    }

}
