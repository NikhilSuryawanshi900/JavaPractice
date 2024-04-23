package day4.Interfacedemo;

public class ICICI implements RBI {
    @Override
    public void getTransaction() {
        System.out.println("Transaction from ICICI");
    }

    @Override
    public void getName() {
        System.out.println("Name from ICICI");
    }

    @Override
    public void getAcNo() {
        System.out.println("Account no from ICICI");
    }
}
