import org.junit.jupiter.api.*;
import static org.junit.Assert.*;

public class WorkerTest {
    private Worker worker;
    private Address address1;
    private Address address2;

    @BeforeEach
    public void setUp() {
        address1 = new Address("Kopernika", 20, 1, "Gdynia");
        address2 = new Address("Mickiewicza", 10, 2, "Sopot");
        worker = new Worker(0, "Jan", "Nowak", 22, 2, address1);
    }

    @Test
    public void test_getId() {
        assertEquals(0, worker.getId(), 0);
    }

    @Test
    public void test_getFirstName() {
        assertEquals("Jan", worker.getFirstName());
    }

    @Test
    public void test_getLastName() {
        assertEquals("Nowak", worker.getLastName());
    }

    @Test
    public void test_getAge() {
        assertEquals(22, worker.getAge(), 0);
    }

    @Test
    public void test_getExp() {
        assertEquals(2, worker.getExp(), 0);
    }

    @Test
    public void test_getAddress() {
        assertEquals(address1, worker.getAddress());
    }

    @Test
    public void test_setId() {
        worker.setId(1);
        assertEquals(1, worker.getId(), 0);
    }

    @Test
    public void test_setFirstName() {
        worker.setFirstName("Marcin");
        assertEquals("Marcin", worker.getFirstName());
    }

    @Test
    public void test_setLastName() {
        worker.setLastName("Kowalski");
        assertEquals("Kowalski", worker.getLastName());
    }

    @Test
    public void test_setAge() {
        worker.setAge(44);
        assertEquals(44, worker.getAge(), 0);
    }

    @Test
    public void test_setExp() {
        worker.setExp(4);
        assertEquals(4, worker.getExp(), 0);
    }

    @Test
    public void test_setAddress() {
        worker.setAddress(address2);
        assertEquals(address2, worker.getAddress());
    }
}
