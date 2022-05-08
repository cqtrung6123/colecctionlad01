package jdbcapp.mvc.view;

import jdbcapp.mvc.controller.ProductController;
import jdbcapp.mvc.entity.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductConsole {
    //b1 goi controller
    ProductController productController=new ProductController();
    Product product=new Product();
    private final Scanner sc;
    public ProductConsole() throws SQLException, ClassNotFoundException {
        this.sc=new Scanner(System.in);
    }
    public int menu(){
        System.out.println("PRODUCT");
        System.out.println("1 Create product");
        System.out.println("2 Get product by Id");
        System.out.println("3 Get all product");
        System.out.println("4 Get product by Name");
        System.out.println("5 Update product");
        System.out.println("6 Delete product");
        System.out.println("7 Exit");


        int choice=ReadInt(0,7);
        return choice;
    }
    public int ReadInt(int min,int max){
        int choice;
        while (true){
                choice=Integer.parseInt(sc.nextLine());
                if (choice>=min && choice<=max){
                    break;
                }
        }
        return choice;
    }


    public void start() throws SQLException, ClassNotFoundException {
        while (true)
        {
            int choice=menu();

                 switch (choice)
                 {
                     case 0:
                         System.exit(0);
                     case 1:
                         CreateProduct();
                        break;
                     case 2:
                         GetById();
                         break;
                     case 3:
                         GetAll();
                         break;
                     case 4:
                         GetByName();
                         break;
                     case 5:
                         UpdateProduct();
                         break;
                     case 6:
                         DeleteProduct();
                         break;
                     default:throw new AssertionError();
                 }
            }
    }
    public void CreateProduct() throws SQLException, ClassNotFoundException {
        System.out.println("Enter proName:");
        String name= sc.nextLine();

        System.out.println("Enter proDesc:");
        String desc=sc.nextLine();

        System.out.println("Enter price:");
        Double price=Double.parseDouble(sc.nextLine());

        Product product=new Product(name,desc,price);
        productController.createPro(product);

    }
    public void GetById() throws SQLException, ClassNotFoundException {
        System.out.println("Enter Id:");
        int id=Integer.parseInt(sc.nextLine());
        productController.getById(id);
    }
    public void GetAll() throws SQLException, ClassNotFoundException {
       ArrayList<Product>products= productController.getAllProduct();
        System.out.println("--All product--");
        System.out.println("Id\t\tproName\t\tptoDesc\t\tprice");
        for (Product product:products){
            System.out.println(product.getId()+"\t\t"+product.getProName()+"\t\t"+product.getProDesc()+"\t\t"+product.getPrice());
        }
    }
    public void GetByName() throws SQLException, ClassNotFoundException {
        System.out.println("Enter proName:");
        String name=sc.nextLine();
        productController.getByName(name);
    }
    public void UpdateProduct() throws SQLException, ClassNotFoundException {
        System.out.println("Enter id");
        int id=Integer.parseInt(sc.nextLine());
        product.setId(id);
        System.out.println("Enter proName:");
        String name= sc.nextLine();
        product.setProName(name);
        System.out.println("Enter proDesc:");
        String desc=sc.nextLine();
        product.setProDesc(desc);
        System.out.println("Enter price:");
        Double price=Double.parseDouble(sc.nextLine());
        product.setPrice(price);
        productController.updateProduct(product);
    }
    public void DeleteProduct() throws SQLException, ClassNotFoundException {
        System.out.println("Enter id of product");
        int id=Integer.parseInt(sc.nextLine());
        boolean result=productController.deleteProduct(id);
        if (result){
            System.out.println("product was removed");
        }else {
            System.out.println("product not found!");
        }
    }
}
