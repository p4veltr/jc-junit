import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MissedCallsTest {
    private MissedCalls mc;

    @BeforeEach
    public void generateData() {
        mc = new MissedCalls();
    }

    @Test
    public void testAddMissedCall() {
        String phone = "+777";
        MissedCalls mc = new MissedCalls();
        mc.addMissedCall(phone);
        Assertions.assertTrue(mc.hasMissedCallFromPhone(phone));
    }

    @Test
    public void testNotExistingMissedCall() {
        MissedCalls mc = new MissedCalls();
        boolean hasMissedCall = mc.hasMissedCallFromPhone("-1");
        Assertions.assertNull(hasMissedCall ? hasMissedCall : null);
    }
}
