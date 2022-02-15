public class OfficeWorker extends Worker {
    private Integer id_office;
    private Integer iq;
    private Integer value;

    public OfficeWorker(Integer id, String firstName, String lastName, Integer age, Integer exp, Address address,
            Integer id_office, Integer iq) throws Exception {
        super(id, firstName, lastName, age, exp, address);
        this.setId_office(id_office);
        this.setIq(iq);
        this.setValue();
    }

    public Integer getId_office() {
        return this.id_office;
    }

    public void setId_office(Integer id_office) {
        this.id_office = id_office;
    }

    public Integer getIq() {
        return this.iq;
    }

    public void setIq(Integer iq) throws Exception {
        if (70 <= iq && iq <= 150) {
            this.iq = iq;
            this.setValue();
        } else {
            throw new Exception("This iq value is not allowed");
        }
    }

    @Override
    public Integer getValue() {
        return this.value;
    }

    public void setValue() {
        this.value = this.getExp() * this.getIq();
    }

    @Override
    public void setExp(Integer exp) {
        this.exp = exp;
        this.setValue();
    }
}
