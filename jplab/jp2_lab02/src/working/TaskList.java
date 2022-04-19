package working;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class TaskList {
     public static List<Task> taskList=new ArrayList<Task>();
    public TaskList(){
        this.taskList=new ArrayList<Task>();
    }
    public  TaskList (ArrayList<Task> taskList){
        this.taskList=taskList;
    }
    public static void addTask(Task task)throws IOException {
        try {
            taskList.add(task);
            FileWriter writer=new FileWriter("tasklist.json");
            Gson gson=new Gson();
            String in4=gson.toJson(taskList);
            writer.write(in4);
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void showtask(){
        try {
            FileReader reader=new FileReader("taskslist.json");
            Type type=new TypeToken<ArrayList<Task>>(){}.getType();
            taskList=new Gson().fromJson(reader,type);
            for (Task task:taskList){
                System.out.println(task);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
