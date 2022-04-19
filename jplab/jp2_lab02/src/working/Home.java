package working;

import java.io.IOException;
import java.util.Scanner;

public class Home {
    public void homemanager(){
        Worker worker=new Worker(1,"Lan");
        Worker worker1=new Worker(2,"Nam");
        System.out.println("***********************");
        System.out.println("=========chuc nang=========");
        System.out.println("1. Quản lí");
        System.out.println("2. Xem tiến trình công việc");
        System.out.println("3. Xem danh sách công việc");
        System.out.println("4. Thoat chương trình");
        System.out.println("=============================");
        TaskList taskList=new TaskList();
        Manager manager=new Manager();
        int i=new Scanner(System.in).nextInt();
        while (true){
            switch (i){
                case 1:
                    manager.TaskManager();
                case 2:
                    worker.start();
                    worker1.start();
                case 3:
                    taskList.showtask();
                    homemanager();
                case 4:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Home home=new Home();
        home.homemanager();
    }
}
