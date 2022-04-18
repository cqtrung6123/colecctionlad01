package lab6.part1;

import java.util.PriorityQueue;

public class AppointDoctor {
    //create a new instance od appointDoctor
    public AppointDoctor(){}

    public static void main(String[] args) {
        //creating  a priorityQueue
        PriorityQueue pq=new PriorityQueue<>();

        Doctor Cardiologist=new Doctor("Casuality",1);
        Doctor Gynecologist = new Doctor("Surgery", 2);
        Doctor Paediatric= new Doctor("Routine Chek-up", 3);

        //adding doctor object ti the Queue
        pq.offer(Cardiologist);
        pq.offer(Gynecologist);
        pq.offer(Paediatric);
        //remove the element from the queue as per their priorities
        while (!pq.isEmpty()){
            //displaying the hearder information
            System.out.println("\n Appointing doctors based on their prioriries:");
            System.out.println("****************************");
            //removeing the doctor as per their priorities
            Doctor doctor=((Doctor) pq.remove());
            //invoking the tostring() method
            System.out.println(doctor.toString());
        }

    }
}
