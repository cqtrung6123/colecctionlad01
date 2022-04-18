package lab6.part1;

public class Doctor implements Comparable{
    public Doctor(String name, int task){
        this.name=name;
        this.task=task;
    }
    @Override
    public int compareTo(Object obj) {
        //create a doctor object
        Doctor doc=(Doctor) obj;

        int a=0;
        int b=0;
        a=this.task;
        b=this.task;
        //highest number determines the higest priority for the appointments
        if (a<b)
            return -1;
        if (a>b)
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "\nThe Doctor is appointed for = "+name+"\nThe prority for the appointment is= "+task;

    }
    private String name="";
    private int task=0;

}
