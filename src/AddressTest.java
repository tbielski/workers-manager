import org.junit.jupiter.api.*;
import static org.junit.Assert.*;

public class AddressTest {
    private Address address;

    @BeforeEach
    public void setUp() {
        address = new Address("Kopernika", 20, 1, "Gdynia");
    }

    @Test
    public void test_getStreet() {
        assertEquals("Kopernika", address.getStreet());
    }

    @Test
    public void test_getBuildingNumber() {
        assertEquals(20, address.getBuildingNumber(), 0);
    }

    @Test
    public void test_getHomeNumber() {
        assertEquals(1, address.getHomeNumber(), 0);
    }

    @Test
    public void test_getCity() {
        assertEquals("Gdynia", address.getCity());
    }

    @Test
    public void test_setStreet() {
        address.setStreet("Mickiewicza");
        assertEquals("Mickiewicza", address.getStreet());
    }

    @Test
    public void test_setBuildingNumber() {
        address.setBuildingNumber(10);
        assertEquals(10, address.getBuildingNumber(), 0);
    }

    @Test
    public void test_setHomeNumber() {
        address.setHomeNumber(2);
        assertEquals(2, address.getHomeNumber(), 0);
    }

    @Test
    public void test_setCity() {
        address.setCity("Sopot");
        assertEquals("Sopot", address.getCity());
    }
}
