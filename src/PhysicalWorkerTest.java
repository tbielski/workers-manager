import org.junit.jupiter.api.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PhysicalWorkerTest {
    private PhysicalWorker physicalWorker;
    private Address address;

    @BeforeEach
    public void setUp() throws Exception {
        address = new Address("Kopernika", 20, 1, "Gdynia");
        physicalWorker = new PhysicalWorker(0, "Jan", "Nowak", 22, 2, address, 20);
    }

    @Test
    public void test_getStrength() {
        assertEquals(20, physicalWorker.getStrength(), 0);
    }

    @Test
    public void test_getValue() {
        assertEquals(1, physicalWorker.getValue(), 0);
    }

    @Test
    public void test_setStrength_Success() throws Exception {
        physicalWorker.setStrength(50);
        assertEquals(50, physicalWorker.getStrength(), 0);
    }

    @Test
    public void test_setStrength_Failure() throws Exception {
        assertThrows(Exception.class, () -> physicalWorker.setStrength(101), "This strength value is not allowed");
    }

    @Test
    public void test_setValue_Exp() {
        physicalWorker.setExp(4);
        assertEquals(3, physicalWorker.getValue(), 0);
    }

    @Test
    public void test_setValue_Strength() throws Exception {
        physicalWorker.setStrength(50);
        assertEquals(4, physicalWorker.getValue(), 0);
    }

    @Test
    public void test_setValue_Age() {
        physicalWorker.setAge(10);
        assertEquals(4, physicalWorker.getValue(), 0);
    }
}
