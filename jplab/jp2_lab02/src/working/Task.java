package working;

import java.util.List;

public class Task {
    private int idtask;
    private  String task;

    public Task(int id, String nametask) {
        this.idtask=id;
        this.task=nametask;
    }

    public int getIdtask() {
        return idtask;
    }

    public void setIdtask(int idtask) {
        this.idtask = idtask;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return idtask+"  "+task;
    }
}
