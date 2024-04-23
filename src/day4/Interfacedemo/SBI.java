package day4.Interfacedemo;

public class SBI implements RBI{
    @Override
    public void getTransaction() {
        System.out.println("Transaction from SBI");
    }

    @Override
    public void getName() {
        System.out.println("Name from SBI");
    }

    @Override
    public void getAcNo() {
        System.out.println("Account no from SBI");
    }
}
