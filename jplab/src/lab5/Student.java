package lab5;


import java.io.Serializable;

public class Student implements Serializable {
    private int rollnumber;
    private String name;
    private int age;
    private float mark;

    public Student(){}

    public Student(int rollnumber, String name, int age, float mark) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "rollNumber : "+rollnumber+", name : "+name+", Age : "+age+", mark : "+mark;
    }
}
