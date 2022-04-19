package working;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Worker extends Thread{
    private  int idtask;
    public String nameworker;
    public static List<Task>list=new ArrayList<Task>();
    public Worker(int idtask,String nameworker){
        this.idtask=idtask;
        this.nameworker=nameworker;
    }
    public int getIdtask() {
        return idtask;
    }

    public void setIdtask(int idtask) {
        this.idtask = idtask;
    }

    public String getNameworker() {
        return nameworker;
    }

    public void setNameworker(String nameworker) {
        this.nameworker = nameworker;
    }

    @Override
    public void run() {
        try {
            FileReader reader=new FileReader("taskslist.json");
            Type type=new TypeToken<ArrayList<Task>>(){}.getType();
            list=new Gson().fromJson(reader,type);
            for (int i=0;i<list.size();i++){
                if(i==idtask){
                    for (int j=5;j>=0;j--){
                        synchronized (list.get(i-1)){
                            System.out.println(list.get(i-1)+" "+nameworker+" :"+j);
                            Thread.sleep(2000);
                        }
                    }
                    Thread.sleep(3000);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
