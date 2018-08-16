import java.util.*;

public class CommandCenterClient {

    private final int liftCount;
    private final int floorCount;
    private final CommandCenter commandCenter;

    private Map<Integer, FloorControlPanel> floorControlPanetMap;

    public CommandCenterClient(int liftCount, int floorCount, CommandCenter commandCenter) {

        this.liftCount = liftCount;
        this.floorCount = floorCount;
        this.commandCenter = commandCenter;

        configureFloorInvokers();
    }

    private void configureFloorInvokers() {
        floorControlPanetMap = new HashMap<>();

        for (int i=0; i<floorCount; i++) {
            FloorControlPanel floorControlPanel = new FloorControlPanel();
            CallLiftCommand callLiftUpCommand = new CallLiftCommand(commandCenter, i, Direction.UP);
            CallLiftCommand callLiftDownCommand = new CallLiftCommand(commandCenter, i, Direction.DOWN);

            floorControlPanel.setCommand(callLiftUpCommand, callLiftDownCommand);

            floorControlPanetMap.put(i, floorControlPanel);
        }
    }
}
