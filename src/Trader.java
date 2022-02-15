public class Trader extends Worker {
    private String effectiveness;
    private Integer commission;
    private Integer value;

    public Trader(Integer id, String firstName, String lastName, Integer age, Integer exp, Address address,
            String effectiveness, Integer commission) throws Exception {
        super(id, firstName, lastName, age, exp, address);
        this.setEffectiveness(effectiveness);
        this.setCommission(commission);
        this.setValue();
    }

    public String getEffectiveness() {
        return this.effectiveness;
    }

    public void setEffectiveness(String effectiveness) throws Exception {
        if ("NISKA" == effectiveness || "ŚREDNIA" == effectiveness || "WYSOKA" == effectiveness) {
            this.effectiveness = effectiveness;
            this.setValue();
        } else {
            throw new Exception("This effectiveness value is not allowed");
        }
    }

    public Integer getCommission() {
        return this.commission;
    }

    public void setCommission(Integer commission) throws Exception {
        if (1 <= commission && commission <= 99) {
            this.commission = commission;
        } else {
            throw new Exception("This commission value is not allowed");
        }
    }

    @Override
    public Integer getValue() {
        return this.value;
    }

    public void setValue() {
        if (this.getEffectiveness() == "NISKA") {
            this.value = this.getExp() * 60;
        } else if (this.getEffectiveness() == "ŚREDNIA") {
            this.value = this.getExp() * 90;
        } else if (this.getEffectiveness() == "WYSOKA") {
            this.value = this.getExp() * 120;
        }
    }

    @Override
    public void setExp(Integer exp) {
        this.exp = exp;
        this.setValue();
    }
}
