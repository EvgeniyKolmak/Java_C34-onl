package command;

public class CloseButton implements ButtonAction{

    @Override
    public void doAction() {
        System.out.println("Close");
    }
}
