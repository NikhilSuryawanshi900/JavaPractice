package Day3.StaticBlock;

public class Demo {
    public void print()
    {
        System.out.println("Print method");
    }

    {
        System.out.println("Instance block1");
    }
    {
        System.out.println("Instance block2");
    }
 static  {

     System.out.println("Static block: ");
 }
    public static void main(String[] args) {
      System.out.println("Main method");
      Demo obj=new Demo();
      obj.print();

 }
}
