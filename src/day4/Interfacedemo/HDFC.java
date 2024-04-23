package day4.Interfacedemo;

public class HDFC implements RBI{

    @Override
    public void getTransaction() {
        System.out.println("Transaction from HDFC");
    }

    @Override
    public void getName() {
        System.out.println("Name from HDFC");
    }

    @Override
    public void getAcNo() {
        System.out.println("Account no from HDFC");
    }
}
