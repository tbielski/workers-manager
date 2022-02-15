import java.util.ArrayList;
import java.util.Comparator;

public class Register {
    public ArrayList<Worker> workers;

    public Register() {
        this.workers = new ArrayList<>();
    }

    public ArrayList<Worker> getWorkers() {
        return this.workers;
    }

    public void setWorkers(ArrayList<Worker> workers) {
        this.workers = workers;
    }

    public void add_worker(Worker workerToAdd) throws Exception {
        for (Worker worker : this.getWorkers()) {
            if (workerToAdd.getId() == worker.getId()) {
                throw new Exception("This id already exist");
            }
        }
        workers.add(workerToAdd);
    }

    public void delete_worker(Integer id) {
        for (Worker worker : workers) {
            if (worker.getId() == id) {
                workers.remove(worker);
            }
        }
    }

    public void add_many_workers(ArrayList<Worker> workersAdd) throws Exception {
        for (Worker worker : workersAdd) {
            this.add_worker(worker);
        }
    }

    public ArrayList<Worker> view_sorted_list(Comparator<Worker> comparator) {
        ArrayList<Worker> sortedArray = this.getWorkers();
        sortedArray.sort(comparator);
        return sortedArray;
    }

    public ArrayList<Worker> filter_by_city(String city) {
        ArrayList<Worker> result = new ArrayList<>();
        for (Worker worker : workers) {
            if (worker.getAddress().getCity() == city) {
                result.add(worker);
            }
        }
        return result;
    }

    public ArrayList<Tuple> view_with_value() {
        ArrayList<Tuple> result = new ArrayList<>();
        for (Worker worker : workers) {
            result.add(new Tuple(worker));
        }
        return result;
    }
}
