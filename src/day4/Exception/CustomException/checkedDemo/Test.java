package day4.Exception.CustomException.checkedDemo;

import java.util.Scanner;

class ValidAgeException extends Exception{
    public ValidAgeException()
    {
        super("\"Not Eligible to vote!!\"");
    }
    public ValidAgeException(String msg)
    {
        super(msg);
    }
}



public class Test {

    public static void main(String[] args) throws ValidAgeException {
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();
//        try {
            if (age >= 18) {
                System.out.println("eligible for vote");
            } else {
                throw new ValidAgeException();
            }
//        }
//        catch (ValidAgeException e)
//        {
//            System.out.println(e);
//        }
    }
}
