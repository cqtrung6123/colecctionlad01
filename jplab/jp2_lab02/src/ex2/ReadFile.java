package ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        System.out.println("RUN MY FAVORITE PROGRAMS");
        System.out.println("\t1 .notepad");
        System.out.println("\t2 .Paint");
        System.out.println("\t3 .Microsoft Word");
        System.out.println("\t4 .Microsoft Excel");
        System.out.println("\t5 .Calculator");
        System.out.println("\t6 .Internet Explorer");
        System.out.println("\t7 .Windown Explorer");
        System.out.println("\t8 .Exit");
        System.out.println("RUN:");
      while (true){
          System.out.println("Moi ban chon chuc nang");
          Scanner scanner=new Scanner(System.in);
          int c=scanner.nextInt();
          switch (c){
              case 1:
                  System.out.println("Notpad");
                  notpad();
                  break;
              case 2:
                  System.out.println("Paint");
                  Paint();
                  break;
              case 3:
                  System.out.println("Microsoft Word");
                  Word();
                  break;
              case 4:
                  System.out.println("Microsoft Excel");
                  Excel();
                  break;
              case 5:
                  System.out.println("Calculator");
                  Calculator();
                  break;
              case 6:
                  System.out.println("Internet Explorer");
                  InternetEx();
                  break;
              case 7:
                  System.out.println("Windown Explorer");
                  WindownEx();
                  break;
              case 8:
                  System.out.println("Exit");
                  break;
          }
      }

    }
    public static void notpad(){
        try (BufferedReader bufferedReader=new BufferedReader(new FileReader("C:\\Users\\admin\\javafptaptech\\jp2\\jp2_lab02\\src\\ex2\\programs.txt"))){
            String line=bufferedReader.readLine();
            while (line!=null&&line.contains("Notepad")){
                System.out.println(line);
                line=bufferedReader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void Paint(){
        try (BufferedReader bufferedReader=new BufferedReader(new FileReader("C:\\Users\\admin\\javafptaptech\\jp2\\jp2_lab02\\src\\ex2\\programs.txt"))){
            String line=bufferedReader.readLine();
            while (line!=null){
                System.out.println(line);
                line=bufferedReader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void Word(){
        try (BufferedReader bufferedReader=new BufferedReader(new FileReader("C:\\Users\\admin\\javafptaptech\\jp2\\jp2_lab02\\src\\ex2\\programs.txt"))){
            String line=bufferedReader.readLine();
            while (line!=null){
                System.out.println(line);
                line=bufferedReader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void Excel(){
        try (BufferedReader bufferedReader=new BufferedReader(new FileReader("C:\\Users\\admin\\javafptaptech\\jp2\\jp2_lab02\\src\\ex2\\programs.txt"))){
            String line=bufferedReader.readLine();
            while (line!=null){
                System.out.println(line);
                line=bufferedReader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void Calculator(){
        try (BufferedReader bufferedReader=new BufferedReader(new FileReader("C:\\Users\\admin\\javafptaptech\\jp2\\jp2_lab02\\src\\ex2\\programs.txt"))){
            String line=bufferedReader.readLine();
            while (line!=null){
                System.out.println(line);
                line=bufferedReader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void InternetEx(){
        try (BufferedReader bufferedReader=new BufferedReader(new FileReader("C:\\Users\\admin\\javafptaptech\\jp2\\jp2_lab02\\src\\ex2\\programs.txt"))){
            String line=bufferedReader.readLine();
            while (line!=null&&line.contains("Internet Explorer")){
                System.out.println(line);
                line=bufferedReader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void WindownEx(){
        try (BufferedReader bufferedReader=new BufferedReader(new FileReader("C:\\Users\\admin\\javafptaptech\\jp2\\jp2_lab02\\src\\ex2\\programs.txt"))){
            String line=bufferedReader.readLine();
            while (line!=null){
                System.out.println(line);
                line=bufferedReader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
