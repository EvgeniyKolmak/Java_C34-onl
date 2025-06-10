package momento;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GameState {

    private String name;
    private int score;
    private boolean isPlaying;

    private GameState backupState;

    public GameState(String name, int score, boolean isPlaying) {
        this.name = name;
        this.score = score;
        this.isPlaying = isPlaying;
    }

    public void backup() {
        backupState = new GameState(name, score, isPlaying);
    }

    public void restore() {
        name = backupState.getName();
        score = backupState.getScore();
        isPlaying = backupState.isPlaying();
    }


}
