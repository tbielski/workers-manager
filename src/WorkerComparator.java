import java.util.Comparator;

public class WorkerComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker worker1, Worker worker2) {
        Integer exp1 = worker1.getExp();
        Integer exp2 = worker2.getExp();
        Integer result1 = exp2 - exp1;
        if (result1 == 0) {
            Integer age1 = worker1.getAge();
            Integer age2 = worker2.getAge();
            Integer result2 = age1 - age2;
            if (result2 == 0) {
                String name1 = worker1.getLastName();
                String name2 = worker2.getLastName();
                return name1.compareTo(name2);
            }
            return result2;
        }
        return result1;
    }
}
