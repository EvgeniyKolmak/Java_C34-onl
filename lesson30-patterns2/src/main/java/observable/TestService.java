package observable;

import java.util.Observable;

public class TestService extends Observable {

    public void addNews(News news) {

        var text = news.getText() + "!!!!";

        System.out.println("New news: " + text);

        setChanged();

        notifyObservers(news);

    }

}
