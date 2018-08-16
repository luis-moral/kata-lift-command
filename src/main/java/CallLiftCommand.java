public class CallLiftCommand implements Command {

    private final CommandCenter commandCenter;
    private final int floorId;
    private final Direction direction;

    public CallLiftCommand(CommandCenter commandCenter, int floorId, Direction direction) {
        this.commandCenter = commandCenter;
        this.floorId = floorId;
        this.direction = direction;
    }

    @Override
    public void execute() {
        commandCenter.callLift(floorId, direction);
    }
}
