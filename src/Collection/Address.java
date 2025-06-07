package Collection;

public class Address {
    private String street;

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    private String zipCode; //Поле может быть null
}