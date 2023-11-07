public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    // Constructor for the address
    public Address(String street, String city, String state, String zipCode){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Getters for the address
    public String getStreet(){
        return street;
    };
    public String getCity(){
        return city;
    };
    public String getState(){
        return state;
    };
    public String getZipCode(){
        return zipCode;
    };

    // Setters for the Address
    public void setStreet(String street){
        this.street = street;
    };
    public void setCity(String city){
        this.city = city;
    };
    public void setState(String state){
        this.state = state;
    };
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    };

}
