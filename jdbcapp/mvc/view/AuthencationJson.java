package jdbcapp.mvc.view;

import jdbcapp.mvc.controller.productControllerJson;

import java.util.Scanner;

public class AuthencationJson {
    static final Scanner scanner=new Scanner(System.in);
    static productControllerJson productControllerJson=new productControllerJson();
    public static void main(String[] args) {
        while (true){
            int choice=menu();
            switch (choice){
                case 1:
                    SearchById();
                    break;
                case 2:
                    SearchByName();
                    break;
                case 3:
                    DisplayAll();
                    break;
                case 4:
                    System.out.println("You have exit the program");
                    System.exit(0);
            }
        }
    }
    public static int menu(){

        System.out.println("--JSON--");
        System.out.println("1. Get product by ID");
        System.out.println("2. Get product by NAME");
        System.out.println("3. Get all product");
        System.out.println("4 exit");
        int choice=Readint(1,4);
        return choice;
    }
    public static int Readint(int min, int max){
        int choice;
        while (true){
            try {
                 choice=Integer.parseInt(scanner.nextLine());
                if (choice>=min&&choice<=max){
                    break;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return choice;
    }
    public static void SearchById(){
        System.out.println("Please enter Id:");
        int id=Integer.parseInt(scanner.nextLine());
        productControllerJson.getById(id);
    }
    public static void SearchByName(){
        System.out.println("Please enter Name:");
        String name=scanner.nextLine();
        productControllerJson.searchByName(name);
    }
    public static void DisplayAll(){
        productControllerJson.displayAll();
    }
}
