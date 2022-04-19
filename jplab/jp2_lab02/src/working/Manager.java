package working;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    public static void TaskManager()  {
        TaskList taskList=new TaskList();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("--Manager--");
            System.out.println("1.Thêm Công việc");
            System.out.println("2.Xem Thông tin công việc");
            System.out.println("3.Về trang chủ");
            System.out.println("=============");
            System.out.println("Mời bạn chọn:");

            int c=scanner.nextInt();
            switch (c){
                case 1:
                    System.out.println("Nhập mã công việc: ");
                    int id=scanner.nextInt();
                    System.out.println("Nhập tên công việc: ");
                    String nametask=scanner.next();

                    Task tasklist=new Task(id,nametask);
                    try {
                        taskList.addTask(tasklist);
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    taskList.showtask();
            }
        }
    }
}
