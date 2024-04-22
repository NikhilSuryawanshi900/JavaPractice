package day2.testmodifiers;

public class Student {
    public String name="Ashish";
    String surname="Abc";
    private String add="Delhi";
    protected String mo="4646564564789";


    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s.name);
        System.out.println(s.surname);
        System.out.println(s.mo);
        System.out.println(s.add);

    }
}
