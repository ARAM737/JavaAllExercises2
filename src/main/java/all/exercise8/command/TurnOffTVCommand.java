package all.exercise8.command;

public class TurnOffTVCommand implements Command {
    private Controller theController;

    public TurnOffTVCommand(Controller theController) {
        this.theController = theController;
    }

    @Override
    public void execute() {
        theController.turnOff();
    }
}
