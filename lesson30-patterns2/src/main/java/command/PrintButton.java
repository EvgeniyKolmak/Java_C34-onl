package command;

public class PrintButton implements ButtonAction {

    @Override
    public void doAction() {
        System.out.println("Print");
    }
}
