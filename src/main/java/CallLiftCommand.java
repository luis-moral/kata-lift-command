public class CallLiftCommand implements Command {

    private final CommandCenter commandCenter;
    private final int liftId;
    private final int floorId;
    private final Direction direction;

    public CallLiftCommand(CommandCenter commandCenter, int liftId, int floorId, Direction direction) {
        this.commandCenter = commandCenter;
        this.liftId = liftId;
        this.floorId = floorId;
        this.direction = direction;
    }

    @Override
    public void execute() {
        commandCenter.callLift(liftId, floorId, direction);
    }
}
