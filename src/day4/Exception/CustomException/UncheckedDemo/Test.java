package day4.Exception.CustomException.UncheckedDemo;

import java.util.Scanner;

public class Test {
    public static void validAge(int age)
    {
        if ( age >= 18) {
            System.out.println("eligible for vote");
        } else {
            throw new InValidAgeException();
        }
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();
        validAge(age);
    }
}
