import org.junit.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LiftFeature {

    public static final int LIFT_COUNT = 1;
    public static final int FLOOR_COUNT = 5;

    @Test public void
    lift_command_center_should_move_lift_to_calling_floor() {
        CommandCenter commandCenter = new CommandCenter();
        commandCenter.setInitialFloor(0, 0);

        CommandCenterClient commandCenterClient = new CommandCenterClient(LIFT_COUNT, FLOOR_COUNT, commandCenter);
        commandCenterClient.getFloorControlPanel(3).goToFloorUpButtonWasPushed();

        assertThat(commandCenter.getCurrentFloor(0)).isEqualTo(3);
    }
}
