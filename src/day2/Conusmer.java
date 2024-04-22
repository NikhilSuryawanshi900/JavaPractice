package day2;

import day2.Banking.Bank;

import java.util.Arrays;

public class Conusmer { //Runner Class


    public static void main(String[] args) {
        Bank b1=new Bank("hdfc","gsgsgsg","23464366","Yash","banglore");
        System.out.println(b1);
        String s="198,Donald,OConnell,DOCONNEL,650.507.9833,21-JUN-07,SH_CLERK,2600, - ,124,50";
        String arr[]=s.split(",");
        System.out.println(Arrays.toString(arr));
    }

}
