package day4.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        try {
            System.out.println("Statement 1");
            File f = new File("C:\\Users\\Nikhil_Suryawanshi\\Downloads\\demo\\Practice\\src\\day4\\Exception\\test.txt");
            Scanner sc = new Scanner(f);

            try {
                System.out.println(3 + 4);
                System.out.println(2 / 0);
            }catch (ArithmeticException a)
            {
                System.out.println(a);
            }
            String str=null;
            System.out.println(str.length());
        }
        catch (Exception e)
        {
            System.out.println("Exception Catch Block");
            System.out.println(e);
        }
        finally {
            System.out.println("End");
        }

    }

}
