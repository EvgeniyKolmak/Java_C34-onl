package observable;

import java.util.Observable;
import java.util.Observer;

public class First implements Observer {

    @Override
    public void update(Observable o, Object arg) {

        if (arg instanceof News news) {

            if (news.getType() == News.Type.SPORT) {
                System.out.println("First got a event: news: " + news.getText());
            }

        }


    }
}
