package Day3.polymorphism;

public class Area {
   int a;
   public Area (){
       System.out.println("Non Param Constr.");
    }
    public Area(int a)
    {
        System.out.println("Param constr."+a);
        this.a=a;
    }
    public Area(int a,int b)
    {
        System.out.println("Param constr."+(a*b));
        this.a=a*b;
    }



//   public int square(int side){
//       System.out.println("int");
//        return side*side;
//    }
    public float square(float side){
        System.out.println("float");
        return side*side;
    }
    public double square(double side){
        System.out.println("double");
        return side*side;
    }
//    public long square(long side){
//        System.out.println("long");
//        return side*side;
//    }

    public static void main(String[] args) {
       Area a=new Area(5,5);
        System.out.println(a.square(Double.MAX_VALUE+5));



        System.out.println(1+1);
        System.out.println("A"+"A");

    }


}
