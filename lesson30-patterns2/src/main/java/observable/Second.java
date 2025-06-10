package observable;

import java.util.Observable;
import java.util.Observer;

public class Second implements Observer {

    @Override
    public void update(Observable o, Object arg) {

        if (arg instanceof News news) {

            if (news.getType() == News.Type.POLITICS) {
                System.out.println("Second got a event: news: " + news.getText());
            }

        }


    }

}
