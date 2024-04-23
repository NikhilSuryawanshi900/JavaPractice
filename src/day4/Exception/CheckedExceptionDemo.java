package day4.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Statement 1");
            File f = new File("C:\\Users\\Nikhil_Suryawanshi\\Downloads\\demo\\Practice\\src\\day4\\Exception\\test.tx");
            Scanner sc = new Scanner(f);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Catch Block");
            System.out.println(e);
        }
    }


}
