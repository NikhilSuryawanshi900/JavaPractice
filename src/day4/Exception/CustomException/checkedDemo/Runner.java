package day4.Exception.CustomException.checkedDemo;


public class Runner {
    public static void main(String[] args) {
        Age a=new Age();
        try {
            a.validateAge(19);
        }catch (Exception e)
        {
            System.out.println(e);
        }


    }
}
