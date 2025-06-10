package decorator;

import java.util.ArrayList;
import java.util.List;

public class BufferRandomReader implements RandomReader {

    private List<Integer> buffer = new ArrayList<>();
    private RandomReader randomReader;

    public BufferRandomReader(RandomReader randomReader) {
        this.randomReader = randomReader;
    }

    @Override
    public int read() {

        if (buffer.isEmpty()) {
            for (int i = 0; i < 100; i++) {
                buffer.add(randomReader.read());
            }

            System.out.println("Cache is full");
        }
        System.out.println("Read from buffer");
        return buffer.remove(0);
    }
}
