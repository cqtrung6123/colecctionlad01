package jdbcapp.mvc.controller;


import jdbcapp.mvc.dao.Responsity;
import jdbcapp.mvc.entity.Product;

import java.util.List;
import java.util.Objects;

public class productControllerJson {

    static Responsity responsity=new Responsity();
     public static List<Product>products=responsity.getdata();

    public  void getById(int id){
        for (int i=0;i<products.size();i++){
            if (Objects.equals(id,products.get(i).getId())){
                System.out.println(products.get(i));

                break;
            }else if (i==products.size()-1){
                System.out.println("not found");
            }
        }
    }
    public  void searchByName(String proName){
        for (int i=0;i<products.size();i++){
            if (products.get(i).getProName().contains(proName)){
                System.out.println(products.get(i));
                break;
            }
        }
    }
    public  void displayAll(){
        for (Product product:products){
            System.out.println("=============================");
            System.out.println(product);
        }
    }
}
