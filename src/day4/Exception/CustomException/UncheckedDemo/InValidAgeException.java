package day4.Exception.CustomException.UncheckedDemo;

public class InValidAgeException extends RuntimeException {

    public InValidAgeException()
    {
        super("Invalid age!!");
    }
    public InValidAgeException(String msg)
    {
        super(msg);
    }



}
