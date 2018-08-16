import java.util.HashMap;
import java.util.Map;

public class CommandCenter {
    private final Map<Integer, Integer> liftFloorMap;

    public CommandCenter() {
        this.liftFloorMap = new HashMap<>();
    }

    public void setInitialFloor(int liftId, int floorId) {
        liftFloorMap.put(liftId, floorId);
    }

    public int getCurrentFloor(int liftId) {
        return liftFloorMap.get(liftId);
    }

    public void goToFloor(int liftId, int floorId) {

    }

    public void callLift(int liftId, int floorId, Direction direction) {
        liftFloorMap.put(liftId, floorId);
    }
}
