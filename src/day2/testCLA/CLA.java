package day2.testCLA;

import java.util.Arrays;

public class CLA {
    public static void main(String[] args) {
        int sum=0;
        for (String a:args         ) {
            sum+= Integer.parseInt(a);
        }
        System.out.println(sum);
    }
}
