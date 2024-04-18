package day1;

public class WrapperClasses {
    public static void main(String[] args) {
        String a="20";
        int b=Integer.parseInt(a);
//        System.out.println(a+20);
//        System.out.println(b+20);
        String a1="20.4";
        float f1=Float.parseFloat(a1);
        System.out.println(f1+10.1f);


//        int z=10;
        Integer y=Integer.valueOf(a);
        System.out.println(y+40);



    }
}
