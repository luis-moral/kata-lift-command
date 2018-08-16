public class FloorControlPanel {
    private Command goToFloorUpCommand;
    private Command goToFloorDownCommand;

    public void setCommand(Command goToFloorUpCommand, Command goToFloorDownCommand) {
        this.goToFloorUpCommand = goToFloorUpCommand;
        this.goToFloorDownCommand = goToFloorDownCommand;
    }

    public void goToFloorUpButtonWasPushed() {
        this.goToFloorUpCommand.execute();
    }

    public void goToFloorDownButtonWasPushed() {
        this.goToFloorDownCommand.execute();
    }
}
