package Day3.Inheritance;

public class XUV500 extends Car {
    private boolean isSuspension;

    public XUV500(String company, String model, String colour, String max_speed,boolean isSuspension) {
        super(company, model, colour, max_speed);
        this.isSuspension=isSuspension;
    }

    public boolean isSuspension() {
        return isSuspension;
    }

    public void setSuspension(boolean suspension) {
        isSuspension = suspension;
    }

    public void print()
    {
        System.out.println("This is child class!! xuv500");
    }

    public void runner()
    {
        super.print();
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + this.getCompany() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", colour='" + this.getColour() + '\'' +
                ", max_speed='" + super.getMax_speed() + '\'' +
                "isSuspension=" + isSuspension +
                '}';
    }

    public static void main(String[] args) {
        XUV500 car1=new XUV500("Mahindra","XUV500","black","180", true);
        System.out.println(car1);
        car1.runner();
    }
}
