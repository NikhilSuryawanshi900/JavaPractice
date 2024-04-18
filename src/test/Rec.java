package test;

public class Rec {


    static void print(int n)
    {
        if (n<=0) return ;
        print(n-1);
        System.out.println(n);
    }



    static int factorial(int n)
    {
        if (n==0)
        {
            return 1;
        }
        return n* factorial(n-1);
    }


    static  int fabonacci(int n)
    {
        if (n<=1) return 1;

        return fabonacci(n-1)+fabonacci(n-2);

    }








    public static void main(String[] args) {
//        print(5);
//        System.out.println(factorial(5));
//        System.out.println(fabonacci(5));
        System.out.println('A'>'B');

    }

}
