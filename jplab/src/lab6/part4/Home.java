package lab6.part4;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        GenericCar genericCar=new GenericCar();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("* * * Car * * *");
            System.out.println("Menu");
            System.out.println("1 Add");
            System.out.println("2 Display");
            System.out.println("3 GetSize");
            System.out.println("4 CheckEmty");
            System.out.println("5 Grad");
            System.out.println("6 Exit");
            System.out.println("Mời nhập chức năng:");
            int c=new Scanner(System.in).nextInt();
            switch (c){
                case 1:
                    System.out.println("1 Add");
                    System.out.println("Please Enter vehilcle name:");
                    String name=scanner.nextLine();
                    System.out.println("Please enter Price:");
                    int price=scanner.nextInt();
                    System.out.println("Please enter Production:");
                    int production=scanner.nextInt();
                    genericCar.addcar(name,price,production);
                    break;
                case 2:

                    System.out.println("2 Display");
                    genericCar.display();
                    break;
                case 3:
                    System.out.println("3 GetSize");
                    System.out.println("Please Enter name car:");
                    name=scanner.nextLine();
                    genericCar.getSize(name);
                    break;
                case 4:
                    System.out.println("4 CheckEmty");
                    System.out.println("Please Enter name car:");
                    name=scanner.nextLine();
                    genericCar.checkEmpty(name);

                    break;
                case 5:
                    System.out.println("5 Grad");
                    System.out.println("Please Enter name car:");
                    name=scanner.nextLine();
                    genericCar.delete(name);
                    break;
                case 6:
                    System.out.println("6 Exit");
                    return;
                default:
                    break;
            }
        }
    }
}
