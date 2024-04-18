package day1;

public class InstanceVariables {
    int a=10;

    public  void test()
    {
        int a;
//        System.out.println(a);
        a=20;
//        System.out.println(a);

    }

    public static void main(String[] args) {
        InstanceVariables i=new InstanceVariables();
        i.test();
        System.out.println(i.a);
    }
}
