package model;

/*
Các quy tắc đặt tên: 
Fields: 
- idCustomer: int
- nameCustomer: String
- phoneCustomer: String
- addressCustomer: String
- customerType: String
Method:  
+ getDiscountRate(): double
*/

public class Customer {
    private int idCustomer; 
    private String nameCustomer;
    private String phoneCustomer;
    private String addressCustomer;
    private String customerType = "Regular";
    
    // Constructor
    public Customer() {
    }

    // ID
    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    // Name
    public String getNameCustomer() {
        return this.nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    // Phone
    public String getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    // Address
    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    // Customer Type
    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
}
