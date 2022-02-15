import org.junit.jupiter.api.*;
import static org.junit.Assert.*;

public class TupleTest {
    private Address address1;
    private Worker worker;
    private Tuple tuple;

    @BeforeEach
    public void setUp() throws Exception {
        address1 = new Address("Kopernika", 20, 1, "Gdynia");
        worker = new Trader(0, "Jan", "Nowak", 22, 2, address1, "NISKA", 5);
        tuple = new Tuple(worker);
    }

    @Test
    public void test_getWorker() {
        assertEquals(0, tuple.getWorker().getId(), 0);
    }

    @Test
    public void test_getValue() {
        assertEquals(120, tuple.getValue(), 0);
    }
}
