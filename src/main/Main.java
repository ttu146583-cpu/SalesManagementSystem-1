package main;

import java.util.Scanner;
import service.CustomerService;



public class Main {
    public static void main(String[] args) throws Exception {
        int menuChoice;                    // biến điều kiển luồng menu
        Scanner sc = new Scanner(System.in);
        CustomerService customerService = new CustomerService();

        // Menu Interface
        do {
            System.out.println("======================================");
            System.out.format("%31s", "SALES MANAGEMENT SYSTEM\n");
            System.out.println("======================================");
            System.out.println("  1. Manage Products");
            System.out.println("  2. Manage Customers");
            System.out.println("  3. Manage Sales Transactions");
            System.out.println("  4. Reports");
            System.out.println("  5. Close Program");
            System.out.print("Enter your choice> ");
            menuChoice = sc.nextInt();
            sc.nextLine();
            
            // Choice Options
            switch (menuChoice) {
                case 1: {   // Product Management 

                    break;
                }
                case 2: {   // Customer Mangement
                    int customerChoice = -1;         // biến điều khiển luồng customer management

                    do {
                        System.out.println("======================================");
                        System.out.format("%27s", "Customer Management\n");
                        System.out.println("======================================");
                        System.out.println("   1. Add New Customer");
                        System.out.println("   2. Update Customer Information");
                        System.out.println("   3. Remove Customer");
                        System.out.println("   4. View All Customer");
                        System.out.println("   0. Back");
                        System.out.printf("Enter your choice> ");
                        customerChoice = sc.nextInt();
                        sc.nextLine();
                        
                        switch (customerChoice) {
                            case 1: {
                                customerService.AddNewCustomer();
                                break;
                            }
                            case 2: {
                                customerService.UpdateCustomerInfor();
                                break;
                            }
                            case 3: {
                                customerService.RemoveCustomer();
                                break;
                            }
                            case 4: {
                                customerService.ViewAllCustomer();
                                break;
                            }
                            case 0: {
                                System.out.println("Backing...");
                            }
                            default:
                                System.out.println("Invalid input! Please choose again.");
                        }
                    } while (customerChoice != 0);
                    break;                 
                }
                case 3: {   // Sales Transaction Management
                    
                    break;
                }
                case 4: {   // Report Service
                    break;                  
                }
                case 0: {   // Close Program
                    System.out.println("Exiting program... Goodbye!");
                    break;
                }
                default:   
                    System.out.println("Invalid input! Please choose again.");
            }
        } while (menuChoice != 0);
        sc.close();
    }
}

