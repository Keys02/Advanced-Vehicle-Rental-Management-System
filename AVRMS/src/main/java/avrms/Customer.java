package avrms;

public class Customer {
    private String customerID;
    private String firstName;
    private String lastName;
    private String contactInfo;
    private String address;
    
    public Customer(String customerID, String firstName, String lastName, String contactInfo){
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = contactInfo;
        this.address = address;
    }
    
    /******************************
                Getters
    *******************************/
    public String getCustomerID() {
        return customerID;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getContactInfo() {
        return contactInfo;
    }
    
    public String getAddress() {
        return address;
    }
    
    /******************************
                Setters
    *******************************/
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
}
