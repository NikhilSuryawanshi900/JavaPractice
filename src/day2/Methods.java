package day2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Methods {

    public void sum(int a ,int b)
    {
        System.out.println(a+b);
        System.out.println("Int");

    }
    public void sum(int a ,float b)
    {
        System.out.println(a+b);
        System.out.println("Float");
    }

    public void sum(int... a)
    {
        int sum=0;
        for (int b:a  ) {
            sum+=b;
            System.out.println(b);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
//        Methods m =new Methods();
//        m.sum(4,7,1,3,4,5);
        Math m1=new Math();
//        int res=m1.max(10,8);
//        System.out.println();
        Student.print();
        String s="test";
        String s1=new String("test class");
        System.out.println(s.equals(s1));
        System.out.println(s.hashCode());
        System.out.println(s1.charAt(2));
        System.out.println(s1.length());
        System.out.println(s1.substring(2,s1.length()));
        s1=s1.concat(" with concat");
        System.out.println(s1);
        s1="this is in start "+s1;
        String a="one";
        String b="one";
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(s1);
        for (int i = s1.length()-1; i >=0 ; i--) {
            System.out.print(s1.charAt(i));
        }
        System.out.println(Arrays.toString(s1.toCharArray()));
        System.out.println(s1.toUpperCase(Locale.ROOT));
        System.out.println(s1.toLowerCase(Locale.ROOT));




    }
}
