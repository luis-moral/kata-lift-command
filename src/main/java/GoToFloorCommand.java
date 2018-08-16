public class GoToFloorCommand implements Command {

    private final CommandCenter commandCenter;
    private final int floorId;

    public GoToFloorCommand(CommandCenter commandCenter, int floorId) {
        this.commandCenter = commandCenter;
        this.floorId = floorId;
    }

    @Override
    public void execute() {
        commandCenter.goToFloor(floorId);
    }
}
