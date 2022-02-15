public class PhysicalWorker extends Worker {
    private Integer strength;
    private Integer value;

    public PhysicalWorker(Integer id, String firstName, String lastName, Integer age, Integer exp, Address address,
            Integer strength) throws Exception {
        super(id, firstName, lastName, age, exp, address);
        this.setStrength(strength);
        this.setValue();
    }

    public Integer getStrength() {
        return this.strength;
    }

    public void setStrength(Integer strength) throws Exception {
        if (1 <= strength && strength <= 100) {
            this.strength = strength;
            this.setValue();
        } else {
            throw new Exception("This strength value is not allowed");
        }
    }

    @Override
    public Integer getValue() {
        return this.value;
    }

    public void setValue() {
        this.value = this.getExp() * this.getStrength() / this.getAge();
    }

    @Override
    public void setExp(Integer exp) {
        this.exp = exp;
        this.setValue();
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
        this.setValue();
    }
}
