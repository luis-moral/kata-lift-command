public class FloorControlPanel {
    private Command callLiftUpCommand;
    private Command callLiftDownCommand;

    public void setCommand(Command callLiftUpCOmmand, Command callLiftDownCommand) {
        this.callLiftUpCommand = callLiftUpCOmmand;
        this.callLiftDownCommand = callLiftDownCommand;
    }

    public void goToFloorUpButtonWasPushed() {
        this.callLiftUpCommand.execute();
    }

    public void goToFloorDownButtonWasPushed() {
        this.callLiftDownCommand.execute();
    }
}
