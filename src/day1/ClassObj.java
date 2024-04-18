package day1;

class A1{

    int a=10;

    public void changeValue()
    {
        a=20;
    }
}
public class ClassObj {

    int a=50;


    public static void main(String[] args) {
        A1 o1=new A1();
        ClassObj o2=new ClassObj();
        System.out.println(o1.a);
        o1.changeValue();
        System.out.println(o2.a);

    }
}
