package service;

import java.util.Scanner;
import model.Customer;
import util.Validators;

public class CustomerService {
    Customer[] customers = new Customer[100];
    Scanner sc = new Scanner(System.in);
    private int countCustomer = 0;

    // =====================================================================================================

    public void AddNewCustomer() {
        Customer p = new Customer();
        String name;
        String phone;
        String address;

        System.out.println("----------- New Customer -----------");

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
            p.setPhoneCustomer(phone);
            break;
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

    public void UpdateCustomerInfor() {
        System.out.print("----------- Update Customer Information -----------");
        System.out.print("Enter phone number> ");
        
    }

    // =====================================================================================================

    public void RemoveCustomer() {
        System.out.println("----------- Remove Customer -----------");
        System.out.print("Enter customer phone number> ");
        String phone = sc.nextLine();

        int index = FindCustomerIndexbyPhone(phone);
        if (index == -1) {
            System.out.println("The phone number cannot find");
            return;
        }
        // xóa phần tử bằng cách dịch chuyển các phần tử phía sau lên 1 vị trí
        for (int i = 0; i < countCustomer - 1; i++) {
            customers[i] = customers[i + 1];
        }

        // cập nhật biến đếm và thông báo
        customers[countCustomer - 1] = null; 
        countCustomer--;
        System.out.println("Customer removed successfully!");
    }

    // =====================================================================================================

    public void ViewAllCustomer() {
        System.out.println("----------- CUSTOMER LIST -----------");

        // kiểm tra số lượng hợp lệ
        if (countCustomer == 0) {
            System.out.println("No customers available in the system.");
            return;
        }

        System.out.printf("%-5s %-20s %-15s %-25s %-10s\n", "ID", "Name", "Phone", "Address", "Type");
        System.out.println("-----------------------------------------------------------------------------");
        
        // duyệt các phần tử theo mảng để hiện từng phần tử
        for (int i = 0; i < countCustomer; i++) {
            Customer p = customers[i];
            System.out.printf("%-5d %-20s %-15s %-25s %-10s\n", 
                p.getIdCustomer(), 
                p.getNameCustomer(), 
                p.getPhoneCustomer(), 
                p.getAddressCustomer(), 
                p.getCustomerType());
        }
        System.out.println("-----------------------------------------------------------------------------");
    }

    // =====================================================================================================

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

    // tìm số điện thoại trong các phần tử được lưu trong mảng
    private int FindCustomerIndexbyPhone(String phone) {
        if (phone == null) {
            System.out.println("Invalid input");
            return -1;
        }

        // tìm vị trí phần tử chứ sdt trùng với input 
        for (int i = 0; i< countCustomer; i++) {
            if (customers[i].getPhoneCustomer().equals(phone)) {
                return i;       
            }
        }

        // trả về -1 nếu không tìm thấy sau khi duyệt hết mảng
        return -1;
    }
}
