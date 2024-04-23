package day4.Exception.CustomException.checkedDemo;

public class Age {
    void validateAge(int age) throws Exception
    {
        if (age>18)
        {
            System.out.println("You are eligible to vote!!");
        }else {
            Exception cust=new Exception("Not eligible to vote!!");
            throw cust;
        }
    }

}
