import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MissedCallsTest {
    private MissedCalls sut;

    @BeforeEach
    public void generateData() {
        sut = new MissedCalls();
    }

    @Test
    public void testAddMissedCall() {
        // arrange
        String phone = "+777";

        // act
        sut.addMissedCall(phone);

        // assert
        Assertions.assertTrue(sut.hasMissedCallFromPhone(phone));
    }

    @Test
    public void testNotExistingMissedCall() {
        // act
        boolean hasMissedCall = sut.hasMissedCallFromPhone("-1");

        // assert
        Assertions.assertNull(hasMissedCall ? hasMissedCall : null);
    }
}
