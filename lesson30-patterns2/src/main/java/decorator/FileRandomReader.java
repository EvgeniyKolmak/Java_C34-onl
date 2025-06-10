package decorator;

import java.util.Random;

public class FileRandomReader implements RandomReader {
    @Override
    public int read() {

        System.out.println("read from file");

        Random random = new Random();
        return random.nextInt(100);

    }
}
