package service;

import java.util.Scanner;
import model.Customer;
import util.Validators;

public class CustomerService {
    Customer[] customers = new Customer[100];
    Scanner sc = new Scanner(System.in);
    private int countCustomer = 0;

    public void AddNewCustomer() {
        Customer p = new Customer();
        String name;
        String phone;
        String address;

        System.out.print("----------- New Customer -----------");

        // Input name
        System.out.print("Name: ");
        name = sc.nextLine();
        p.setNameCustomer(name);

        // Input phone number
        while (true) {
            System.out.print("Phone number: ");
            phone = sc.nextLine();
            
            // Validate string 
            if (!Validators.PhoneValidation(phone)) {
                System.out.println("This phone number is NOT valid");
                continue;
            }
            if (!IsPhoneUnique(phone)) {
                System.out.println("This phone number is available");
                continue;
            }

        // Input address
        System.out.print("Address: ");
        address = sc.nextLine();
        p.setAddressCustomer(address);        

        // Update information
        customers[countCustomer] = p;
        countCustomer++;
        System.out.println("Add new customer successfully!");
        }
    }

    public void UpdateCustomerInfor() {
        System.out.print("----------- Update Customer Information -----------");
        
    }

    public void RemoveCustomer() {

    }

    public void ViewAllCustomer() {

    }

    // Các hàm thêm vào ngoài các hàm chính trên UML
    // nhiệm vụ là tìm số điện thoại bị trùng trong mảng customers
    private boolean IsPhoneUnique(String phone) {
        for (int i = 0; i < countCustomer; i++) {
            if (customers[i].getPhoneCustomer().equals(phone)) {
                return false;           
            }
        }
        return true;
    }
}
