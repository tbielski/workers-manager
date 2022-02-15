import org.junit.jupiter.api.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TraderTest {
    private Trader trader;
    private Address address;

    @BeforeEach
    public void setUp() throws Exception {
        address = new Address("Kopernika", 20, 1, "Gdynia");
        trader = new Trader(0, "Jan", "Nowak", 22, 2, address, "NISKA", 5);
    }

    @Test
    public void test_getEffectiveness() {
        assertEquals("NISKA", trader.getEffectiveness());
    }

    @Test
    public void test_getCommission() {
        assertEquals(5, trader.getCommission(), 0);
    }

    @Test
    public void test_getValue() {
        assertEquals(120, trader.getValue(), 0);
    }

    @Test
    public void test_setEffectiveness_Success() throws Exception {
        trader.setEffectiveness("WYSOKA");
        assertEquals("WYSOKA", trader.getEffectiveness());
    }

    @Test
    public void test_setEffectiveness_Failure() throws Exception {
        assertThrows(Exception.class, () -> trader.setEffectiveness("DUŻA"), "This effectiveness value is not allowed");
    }

    @Test
    public void test_setCommission_Success() throws Exception {
        trader.setCommission(10);
        assertEquals(10, trader.getCommission(), 0);
    }

    @Test
    public void test_setCommission_Failure() throws Exception {
        assertThrows(Exception.class, () -> trader.setCommission(0), "This commission value is not allowed");
    }

    @Test
    public void test_setValue_Exp() {
        trader.setExp(3);
        assertEquals(180, trader.getValue(), 0);
    }

    @Test
    public void test_setValue_Effectiveness() throws Exception {
        trader.setEffectiveness("WYSOKA");
        assertEquals(240, trader.getValue(), 0);
    }
}
