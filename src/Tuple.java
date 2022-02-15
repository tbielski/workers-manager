public class Tuple {
    private Worker worker;
    private Integer value;

    public Tuple(Worker worker) {
        this.worker = worker;
        this.value = worker.getValue();
    }

    public Worker getWorker() {
        return this.worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Integer getValue() {
        return this.value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
