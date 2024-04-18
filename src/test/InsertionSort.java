package test;

import java.util.Arrays;

public class InsertionSort {
//    public static void main(String[] args) {
//        int[] array = {7, 3, 1, 5, 6, 2, 4};
//        int n = array.length;
//
//        for (int j = 1; j < n; j++) {
//            int key = array[j];
//            int i = j - 1;
//            while (i > -1 && array[i] > key) {
//                array[i + 1] = array[i];
//                i--;
//            }
//            array[i + 1] = key;
//        }
//    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 1, 5, 6, 2, 4};
        int n = arr.length;
        for (int i = 1; i <n-1 ; i++) {
            int j=i;
            while (j>=1&&arr[j-1]>arr[j])
            {
                int tmp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=tmp;
                j--;
                if (j==0)break;

            }
        }
        System.out.println(Arrays.toString(arr));

    }














}
