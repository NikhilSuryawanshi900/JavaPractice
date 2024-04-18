package test;

public class Test {
    public static void main(String[] args) {

       int []arr={7,3,1,5,6,2,4};
        int n=arr.length;
        for (int i = n-1; i >=1 ; i--) {

            for (int j = 0; j <=i-1 ; j++) {

                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
