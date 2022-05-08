package jdbcapp.mvc.dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jdbcapp.mvc.entity.Product;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class Responsity {
    public List<Product>products;
    public List<Product>getdata(){
        try {
            FileReader reader=new FileReader("product.json");
            //dùng thư viện gson chuyển từ json text sang object
            Type objtype=new TypeToken<List<Product>>(){}.getType();
            products=new Gson().fromJson(reader,objtype);
            for (Product product:products){
                System.out.println(product);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return products;
    }

    public static void main(String[] args) {
        Responsity responsity=new Responsity();
        responsity.getdata();
    }
}
