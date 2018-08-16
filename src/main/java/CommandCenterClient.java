import java.util.List;

public class CommandCenterClient {

    private final int liftCount;
    private final int floorCount;

    private List<FloorControlPanel> floorControlPanets;

    public CommandCenterClient(int liftCount, int floorCount) {

        this.liftCount = liftCount;
        this.floorCount = floorCount;

        configureFloorInvokers();
    }

    private void configureFloorInvokers() {
        for (int i=0; i<floorCount; i++) {
        }
    }
}
