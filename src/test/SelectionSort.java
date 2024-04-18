package test;

public class SelectionSort {


    public static void main(String[] args) {
        int []arr={7,3,1,5,6,2,4};
        int n=arr.length;


        for (int i = 0; i <=n-2 ; i++) {
            int min=i;
            for (int j = i+1; j <=n-1 ; j++) {
                if (arr[min]>arr[j])
                {
                    min=j;
                }

            }

            int tmp=arr[i];
            arr[i]=arr[min];
            arr[min]=tmp;

        }




    }
}
