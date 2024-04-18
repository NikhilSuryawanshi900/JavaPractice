package day1;

public class LocalVariable {
    int a;
    public void print()
    {
        int a=10;
         this.a=20;
        System.out.println(a);

    }

    public  void print2()
    {
        int a =30;
        System.out.println(a);
    }

    public static void main(String[] args) {
        LocalVariable l=new LocalVariable();
        l.print();
        l.print2();


    }
}
