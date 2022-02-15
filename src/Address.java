public class Address {
    private String street;
    private Integer buildingNumber;
    private Integer homeNumber;
    private String city;

    public Address(String street, Integer buildingNumber, Integer homeNumber, String city) {
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.homeNumber = homeNumber;
        this.city = city;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getBuildingNumber() {
        return this.buildingNumber;
    }

    public void setBuildingNumber(Integer buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public Integer getHomeNumber() {
        return this.homeNumber;
    }

    public void setHomeNumber(Integer homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
