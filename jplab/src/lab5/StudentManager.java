package lab5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    List<Student> studentList=new ArrayList<Student>();
    Student student=new Student();
    Scanner scanner=new Scanner(System.in);
    public StudentManager(){
        this.studentList=new ArrayList<>();
    }
    public StudentManager(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addstudent(){
        System.out.println("###### Them sinh vien ######");
        System.out.println("Nhập RollNumber:");
        int rn=scanner.nextInt();
        System.out.println("Nhập Tên:");
        String t=scanner.next();
        System.out.println("Nhập Tuổi:");
        int a=scanner.nextInt();
        System.out.println("Nhập Điểm:");
        float m=scanner.nextFloat();
        Student student=new Student(rn,t,a,m);
        studentList.add(student);
    }
    public void showstudent(){
        System.out.println("-- Danh sach sinh vien");
        for (Student student:studentList){
            System.out.println(student);
        }
    }
    public void updatestudent(List<Student>list,int rollnumber){
        boolean check=false;
        for (Student student:studentList){
            if (rollnumber == student.getRollnumber()){
                check=true;
                addstudent();
                System.out.println("Đã update Student : "+rollnumber);
                break;
            }
        }
        if (!check){
            System.out.println("khong tim thay Rollnumber !");
        }
    }

    public void deletetudent(List<Student>list,int rollnumber){
        boolean check=false;
        for (Student student:studentList){
            if (rollnumber == student.getRollnumber()){
                check=true;
                studentList.remove(student);
                System.out.println("Đã xóa Student :"+rollnumber);
                break;
            }
        }
        if (!check){
            System.out.println("khong tim thay Rollnumber !");
        }
    }
    public void savefile(){
        FileOutputStream fos=null;
        try{
            fos= new FileOutputStream("students.txt");
            for (Student student:studentList){
                String line=student.toString();
                byte[] data=line.toString().getBytes(StandardCharsets.UTF_8);
                fos.write(data);
            }
            System.out.println("Lưu thành công");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fos!=null){

                try {
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public void loadfile(){
        FileInputStream fis=null;
        InputStreamReader reader=null;
        BufferedReader bufferedReader=null;
        try{
            fis=new FileInputStream("students.txt");
            reader=new InputStreamReader(fis,StandardCharsets.UTF_8);
            bufferedReader=new BufferedReader(reader);
            String s;
            s=bufferedReader.readLine();
            while (s!=null){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
