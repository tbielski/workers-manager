import org.junit.jupiter.api.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.ArrayList;

public class RegisterTest {
    private Register register;
    private Address address1;
    private Address address2;
    private Address address3;
    private Address address4;
    private Trader trader1;
    private Trader trader2;
    private OfficeWorker officeworker1;
    private OfficeWorker officeworker2;
    private OfficeWorker officeworker3;
    private PhysicalWorker physicalworker1;
    private PhysicalWorker physicalworker2;
    private ArrayList<Worker> workers1;

    @BeforeEach
    public void setUp() throws Exception {
        register = new Register();

        address1 = new Address("Kopernika", 20, 1, "Gdynia");
        address2 = new Address("Mickiewicza", 10, 2, "Sopot");
        address3 = new Address("Polna", 1, 4, "Gdynia");
        address4 = new Address("Słowackiego", 32, 7, "Gdynia");

        trader1 = new Trader(0, "Jan", "Nowak", 22, 3, address1, "NISKA", 5);
        trader2 = new Trader(1, "Marcin", "Kowalski", 21, 3, address2, "NISKA", 5);

        officeworker1 = new OfficeWorker(2, "Artur", "Kamiński", 31, 1, address1, 0, 80);
        officeworker2 = new OfficeWorker(3, "Wiesław", "Wójcik", 32, 4, address3, 1, 100);
        officeworker3 = new OfficeWorker(3, "Aneta", "Zielińska", 31, 3, address4, 1, 90);

        physicalworker1 = new PhysicalWorker(4, "Anna", "Kowalczyk", 31, 3, address4, 20);
        physicalworker2 = new PhysicalWorker(5, "Julia", "Lewandowska", 31, 3, address2, 40);

        workers1 = new ArrayList<Worker>();
        workers1.add(trader1);
        workers1.add(trader2);
        workers1.add(officeworker1);
        workers1.add(officeworker2);
        workers1.add(physicalworker1);
        workers1.add(physicalworker2);
    }

    @Test
    public void test_getWorkers() {
        assertEquals(0, register.getWorkers().size(), 0);
    }

    @Test
    public void test_add_worker_Success() throws Exception {
        register.add_worker(trader1);
        assertEquals(1, register.getWorkers().size(), 0);
    }

    @Test
    public void test_add_worker_Failure() throws Exception {
        register.add_worker(officeworker2);
        assertThrows(Exception.class, () -> register.add_worker(officeworker3), "This id already exist");
    }

    @Test
    public void test_delete_worker() {
        register.delete_worker(0);
        assertEquals(0, register.getWorkers().size(), 0);
    }

    @Test
    public void test_add_many_workers_Success() throws Exception {
        register.add_many_workers(workers1);
        assertEquals(6, register.getWorkers().size(), 0);
    }

    @Test
    public void test_add_many_workers_Failure() {
        ArrayList<Worker> workers2 = new ArrayList<Worker>();
        workers2.add(officeworker2);
        workers2.add(officeworker3);
        assertThrows(Exception.class, () -> register.add_many_workers(workers2), "This id already exist");
    }

    @Test
    public void test_view_sorted_list() throws Exception {
        register.add_many_workers(workers1);
        ArrayList<Worker> result = register.view_sorted_list(new WorkerComparator());
        assertEquals(3, result.get(0).getId(), 0);
        assertEquals(1, result.get(1).getId(), 0);
        assertEquals(0, result.get(2).getId(), 0);
        assertEquals(4, result.get(3).getId(), 0);
        assertEquals(5, result.get(4).getId(), 0);
        assertEquals(2, result.get(5).getId(), 0);
    }

    @Test
    public void test_filter_by_city() throws Exception {
        register.add_many_workers(workers1);
        ArrayList<Worker> result = register.filter_by_city("Gdynia");
        assertEquals(4, result.size(), 0);
    }

    @Test
    public void test_view_with_value() throws Exception {
        register.add_many_workers(workers1);
        ArrayList<Tuple> result = register.view_with_value();
        assertEquals(6, result.size(), 0);
        assertEquals(0, result.get(0).getWorker().getId(), 0);
        assertEquals(180, result.get(0).getValue(), 0);
    }
}
