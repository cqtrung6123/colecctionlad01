package lab5;

import java.util.List;
import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        StudentManager studentManager=new StudentManager();
        List<Student>list=studentManager.studentList;//dannh sach cac doi tuong dc gan cho list
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println("1 Thêm sinh viên");
            System.out.println("2 Danh sách sinh viên");
            System.out.println("3 Sửa Sinh viên");
            System.out.println("4 Xóa sinh viên");
            System.out.println("5 lưu file");
            System.out.println("6 load file");
            System.out.println("7 Exit");
            System.out.println("Chọn chức năng:");
            int ch=new Scanner(System.in).nextInt();
            switch (ch){
                case 1:
                    System.out.println("Đang thên sinh viên");
                    studentManager.addstudent();
                    break;
                case 2:
                    System.out.println("Danh sách sinh viên");
                    studentManager.showstudent();
                    break;
                case 3:
                    System.out.println("Đang sửa sinh viên");
                        System.out.println("Nhap rollnumber:");
                        int rollnumber=scanner.nextInt();
                        studentManager.updatestudent(list,rollnumber);
                case 4:
                    System.out.println("Đang xóa sinh viên");
                    System.out.println("Nhap rollnumber:");
                     rollnumber=scanner.nextInt();
                    studentManager.deletetudent(list,rollnumber);
                case 5:
                    System.out.println("Đang lưu file");
                    studentManager.savefile();
                    break;
                case 6:
                    System.out.println("Đang load file");
                    studentManager.loadfile();
                    break;
                case 7:
                    return;
                default:
                break;
            }
        }
    }
}
