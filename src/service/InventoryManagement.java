package service;
/**
 * fields
 * Product[] products
 * 
 * methods
 * addNewProducts
 * updateProduct
 * view all product
 * removeProduct
 * searchProduct
 */
public class InventoryManagement {
    Product[]arr=new Product[100];
    int count = 0;
    Scanner sc = new Scanner(System.in);
    //addNewProducts
    public void addNewProduct(){
        boolean cont = No;
        do {
            
            System.out.println("ID Product: ");
             idProduct= sc.nextInt();
             sc.nextLine(); // bỏ dognf thừa

             System.out.println("Name Product: ");
             nameProduct=sc.nextLine();

             System.out.println("Category Product; ");
             categoryProduct=sc.nextLine();

             System.out.println("Price: ");
             price=sc.nextDouble();

             System.out.println("Stock Quantity: ");
             stockQuantity=sc.nextInt();
             arr[count] = new Product(idProduct, nameProduct, categoryProduct, price, stockQuantity);
             count++;
             System.out.println("Add more: YES|NO");
             Scanner sc = new Scanner(System.in);
             count=sc.nextBoolean();
        } while (cont == true && count < 100);

    }
    //updateProduct
    public void updateProduct (int id, int quantity){
        for (int i = 0; i < count; i++)
        {
            if (arr[i].getIdProduct() == id)
            {
                arr[i].updateStockQuantity(quantity);
            
            }
        }
    }
    //viewall
    public void viewAllProducts(){
        for (int i = 0; i < count, i++){
            System.out.println(arr[i].getIdProduct() +"-"+ arr[i].getNameProduct() +"-"+ arr[i].getCategoryProduct() +"-"+ arr[i].getPrice() +"-"+ arr[i].getStockQuantity());
        }
    }

    
    
   

}
