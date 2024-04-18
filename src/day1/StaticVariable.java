package day1;

public class StaticVariable {

    static  int a=10;

    public void print()
    {
//        int a;
//        a=10;
        System.out.println(a);
    }
    public static void print1()
    {
//        a=20;
        System.out.println(a);
    }
    public static void main(String[] args) {
        StaticVariable s=new StaticVariable();
        s.print();
        print1();
        System.out.println(a);

    }



}
