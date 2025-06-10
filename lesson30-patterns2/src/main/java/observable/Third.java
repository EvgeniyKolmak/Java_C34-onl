package observable;

import java.util.Observable;
import java.util.Observer;

public class Third implements Observer {

    @Override
    public void update(Observable o, Object arg) {

        if (arg instanceof News news) {

            System.out.println("Third got a event: news: " + news.getText());

        }


    }

}
