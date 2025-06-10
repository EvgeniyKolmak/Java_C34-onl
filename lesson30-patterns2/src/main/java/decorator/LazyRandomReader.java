package decorator;

public class LazyRandomReader implements RandomReader {

    private RandomReader reader;

    public LazyRandomReader(RandomReader reader) {
        this.reader = reader;
    }

    @Override
    public int read() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return reader.read();

    }

}
