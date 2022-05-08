package jdbcapp.files;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class demoJsonWrite {
    public static void main(String[] args) throws IOException {
        writeDemo1();
        writeDemo2();
        writeDemo3();
    }
    public static void writeDemo1() throws IOException {
        Map<String,Object>map=new HashMap<>();
        map.put("id",1);
        map.put("name","Thao");
        map.put("email","thao@fpt.edu.vn");
        map.put("roles",new String[]{"Member","Admin","Employee"});
        map.put("Admin",true);
        map.put("Employee",true);

        //ghi files:sd class Writer
        Writer writer=new FileWriter("User1.json");
        //convert map to json file
        Gson gson=new Gson();
        gson.toJson(map,writer);
        //close the writer
        writer.close();
        System.out.println("ghi file json thnah cong");
    }
    public static void writeDemo2() throws IOException {
        List<Student> students=new ArrayList<>();
        Student student1=new Student(100,"Student1");
        Student student2=new Student(200,"Student2");
        Student student3=new Student(300,"Student3");
        Student student4=new Student(400,"Student4");
        Student student5=new Student(500,"Student4");
        Student student6=new Student(600,"Student4");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        String fileName="student.json";
        Path path= Paths.get(fileName);
        //bufferwriter giup cho viec ghi file nhanh hon nho vung 'dem' buffer tang toc do ghi file
        Writer writer= Files.newBufferedWriter(path, StandardCharsets.UTF_8);//dinh dang unicode
        Gson gson=new GsonBuilder().setPrettyPrinting().create();
        JsonElement tree=gson.toJsonTree(students);
        gson.toJson(tree,writer);

        writer.close();
        System.out.println("ghi file thanh cong");

    }
    public static void writeDemo3() throws IOException {
        //create object
        User user=new User(1,"Linh","linh@fpt.edu.vn",new String[]
                {"Member","Admin","Employee"},true,true);
        Gson gson=new Gson();
       // Path path=Paths.get("user3.json")
        Writer writer=Files.newBufferedWriter(Paths.get("user3.json"));
        gson.toJson(user,writer);
        writer.close();
        System.out.println("file json thanh cong");
    }
}

