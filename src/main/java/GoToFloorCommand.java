public class GoToFloorCommand implements Command {

    private final CommandCenter commandCenter;
    private final int liftId;
    private final int floorId;

    public GoToFloorCommand(CommandCenter commandCenter, int liftId, int floorId) {
        this.commandCenter = commandCenter;
        this.liftId = liftId;
        this.floorId = floorId;
    }

    @Override
    public void execute() {
        commandCenter.goToFloor(liftId, floorId);
    }
}
