package observable;

public class MainApp {

    public static void main(String[] args) {

        TestService service = new TestService();

        First first = new First();
        Second second = new Second();

        service.addObserver(first);
        service.addObserver(second);
        service.addObserver(new Third());

        News news1 = new News("news1", News.Type.SPORT);
        News news2 = new News("news2", News.Type.POLITICS);

        service.addNews(news1);
        service.addNews(news2);


    }

}
