package day1;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws Exception {
//        Scanner sc=new Scanner(System.in);
        File f=new File("C:\\Users\\Nikhil_Suryawanshi\\Downloads\\demo\\Practice\\src\\day1\\test.txt");
        Scanner sc=new Scanner(f);
//        while (sc.hasNext()) {
//            String s1 = sc.next();
//            System.out.println(s1);
//            if (s1.equals("e")) break;
//        }

        int size=sc.nextInt();
        int arr[]=new int[size];

        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }


        System.out.println(Arrays.toString(arr));



    }
}
