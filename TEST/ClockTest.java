import Chapter3DAndD.Clock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClockTest {
    @Test
    public void testThatIHaveAClock() {
        Clock rolex = new Clock(20, 45, 30);
        assertNotNull(rolex);
    }

    @Test
    public void testThatThisClockHasBeenSetProperly() {
        Clock rolex = new Clock(24, 61, 65);
        rolex.setMethod();
        assertEquals(0, rolex.getHour());
        assertEquals(0, rolex.getMinute());
        assertEquals(0, rolex.getSecond());
    }

    @Test
    public void testThatThisClockCanDisplayTheRightTime() {
        Clock rolex = new Clock(24, 61, 65);
        rolex.setMethod();
        rolex.displayTime();
        assertTrue(true);
        System.out.println(rolex.getHour() + ":" + rolex.getMinute() + ":" + rolex.getSecond());

    }
}
