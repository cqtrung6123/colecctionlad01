package lab6.part4;

import java.util.LinkedList;
import java.util.List;

public class GenericCar {
    List<Car>T=new LinkedList<Car>();

    public GenericCar() {
        this.T=new LinkedList<Car>();
    }

    public GenericCar(List<Car> t) {
        this.T = t;
    }

    public static void add(){

    }
    public static void display(){}
    public static void getSize(){}
    public static void checkEmpty(){}
    public static void delete(){}
}
