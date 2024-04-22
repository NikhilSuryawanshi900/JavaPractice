package test;

import java.util.Scanner;

public class CLITOOL {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true)
        {

            System.out.println("Welcome to the App!!");
            System.out.println("1. Add numbers");
            System.out.println("2. Subtract 2 numbers");

            System.out.print("Enter your choice: ");
            int input=sc.nextInt();
            if(input==0) break;
            switch (input){
                case 1:{
                    System.out.print("Enter the First Number: ");
                    int num1= sc.nextInt();
                    System.out.print("Enter the Second Number: ");
                    int num2= sc.nextInt();
                    System.out.println("Result is : "+(num1+num2));
                    System.out.println( "\n\n\n\n\n");
                    break;
                }

                case 2:{
                    System.out.print("Enter the First Number: ");
                    int num1= sc.nextInt();
                    System.out.print("Enter the Second Number: ");
                    int num2= sc.nextInt();
                    System.out.println("Result is : "+(num1-num2));
                    System.out.println( "\n\n\n\n\n");
                    break;
                }
                default:{
                    System.out.println("Wrong Choice");
                    break;
                }

            }



        }


    }

}
