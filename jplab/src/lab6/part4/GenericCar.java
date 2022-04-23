package lab6.part4;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class GenericCar {
    static Scanner scanner =new Scanner(System.in);
    static  List<Car>t=new LinkedList<Car>();

    public GenericCar() {
        this.t=new LinkedList<Car>();
    }

    public GenericCar(List<Car> t) {
        this.t = t;
    }

    public void addcar(String name,int price,int production){
        Car car=new Car();
        car.setName(name);
        car.setPrice(price);
        car.setProduction(production);
        t.add(car);
    }
    public void display(){
        for (Car car:t){
            System.out.println(car);
        }
    }
    public void getSize(String namesize){
        for (int i=0;i<t.size();i++){
            if(Objects.equals(namesize,t.get(i).getName())){
                System.out.println("Size of :"+namesize+" ="+t.get(i).getProduction());
            }
        }
    }
    public void checkEmpty(String nameCar){
        for (int i=0;i<t.size();i++){
            if(Objects.equals(nameCar,t.get(i).getName())){
                if(t.get(i).getProduction()!=0){
                    System.out.println("Stocking");
                    break;
                }else {
                    System.out.println("Sold out ");
                }
            }else {
                System.out.println("Not found");
            }
        }
    }
    public void delete(String namecar){
        for (int i=0;i<t.size();i++){
            if(Objects.equals(namecar,t.get(i).getName())){
                t.remove(i);
                System.out.println("Deleted");
            }
        }
    }
}
