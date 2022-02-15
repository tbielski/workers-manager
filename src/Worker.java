public class Worker {
    private Integer id;
    private String firstName;
    private String lastName;
    protected Integer age;
    protected Integer exp;
    private Address address;

    public Worker(Integer id, String firstName, String lastName, Integer age, Integer exp, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.exp = exp;
        this.address = address;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getExp() {
        return this.exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getValue() {
        return null;
    }
}
