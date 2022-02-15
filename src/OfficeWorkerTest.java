import org.junit.jupiter.api.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OfficeWorkerTest {
    private OfficeWorker officeWorker;
    private Address address;

    @BeforeEach
    public void setUp() throws Exception {
        address = new Address("Kopernika", 20, 1, "Gdynia");
        officeWorker = new OfficeWorker(0, "Jan", "Nowak", 22, 2, address, 0, 70);
    }

    @Test
    public void test_getId_office() {
        assertEquals(0, officeWorker.getId_office(), 0);
    }

    @Test
    public void test_getIq() {
        assertEquals(70, officeWorker.getIq(), 0);
    }

    @Test
    public void test_getValue() {
        assertEquals(140, officeWorker.getValue(), 0);
    }

    @Test
    public void test_setId_office() {
        officeWorker.setId_office(1);
        assertEquals(1, officeWorker.getId_office(), 0);
    }

    @Test
    public void test_setIq_Success() throws Exception {
        officeWorker.setIq(95);
        assertEquals(95, officeWorker.getIq(), 0);
    }

    @Test
    public void test_setIq_Failure() throws Exception {
        assertThrows(Exception.class, () -> officeWorker.setIq(151), "This iq value is not allowed");
    }

    @Test
    public void test_setValue_Exp() throws Exception {
        officeWorker.setExp(4);
        assertEquals(280, officeWorker.getValue(), 0);
    }

    @Test
    public void test_setValue_Iq() throws Exception {
        officeWorker.setIq(100);
        assertEquals(200, officeWorker.getValue(), 0);
    }
}
