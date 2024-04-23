package day4.AbstractDemo;

public class College extends University{
    void print()
    {
        System.out.println("Implemented method print");
    }


    public static void main(String[] args) {
        University obj=new College();
        obj.print();
        String str=obj.printData("college");
        System.out.println(str);
    }
}
