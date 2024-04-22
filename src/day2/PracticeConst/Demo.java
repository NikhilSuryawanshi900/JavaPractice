package day2.PracticeConst;

import java.util.Scanner;

public class Demo {
    private String name;
    private int age;
    private int accbal;

    public Demo()
    {
        System.out.println("Constructor");
    }
    public Demo(String name,int age,int accbal)
    {
       this.name=name;
       this.age=age;
       this.accbal=accbal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAccbal(int accbal) {
        this.accbal = accbal;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAccbal() {
        return accbal;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", accbal=" + accbal +
                '}';
    }

    public static void main(String[] args) {
        Demo d1=new Demo("Sam",18,2500);
        d1.setName("Yash");
        System.out.println(d1.getName());

    }
}
