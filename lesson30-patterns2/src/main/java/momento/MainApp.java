package momento;

public class MainApp {

    public static void main(String[] args) {

        GameState state =new GameState("state1", 10, true);

        System.out.println(state);

        state.backup();

        state.setName("state2");
        state.setScore(20);
        state.setPlaying(false);

        System.out.println("After changes" + state);

        state.restore();

        System.out.println("after restore " + state);

    }

}
