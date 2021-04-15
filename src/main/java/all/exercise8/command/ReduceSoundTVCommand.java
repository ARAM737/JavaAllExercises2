package all.exercise8.command;

public class ReduceSoundTVCommand implements Command{
    private Controller theController;

    public ReduceSoundTVCommand(Controller theController) {
        this.theController = theController;
    }

    @Override
    public void execute() {
        theController.reduceSound();
    }
}