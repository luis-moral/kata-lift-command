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

        for (int i=0; i<liftCount; i++) {
            for (int j=0; j<floorCount; j++) {
                FloorControlPanel floorControlPanel = new FloorControlPanel();
                CallLiftCommand callLiftUpCommand = new CallLiftCommand(commandCenter, i, j, Direction.UP);
                CallLiftCommand callLiftDownCommand = new CallLiftCommand(commandCenter, i, j, Direction.DOWN);

                floorControlPanel.setCommand(callLiftUpCommand, callLiftDownCommand);

                floorControlPanetMap.put(j, floorControlPanel);
            }
        }
    }

    public FloorControlPanel getFloorControlPanel(int floorId) {
        return floorControlPanetMap.get(floorId);
    }
}
