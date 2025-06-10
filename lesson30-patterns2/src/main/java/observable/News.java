package observable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class News {

    private String text;
    private Type type;

    public static enum Type {

        SPORT, POLITICS;

    }

}
