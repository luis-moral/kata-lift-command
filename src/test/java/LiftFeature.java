import org.junit.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LiftFeature {
    @Test public void
    lift_command_center_should_move_lift_to_calling_floor() {

        CommandCenter commandCenter = new CommandCenter();

        FloorControlPanel floorControlPanel = new FloorControlPanel(3);
        floorControlPanel.callLift(Direction.UP);

        assertThat(commandCenter.getCurrentFloor(0)).isEqualTo(3);
    }
}
