package Day3.Inheritance;

public class Car {
    private String company;
    private String model;
    private String colour;
    private String max_speed;

    public Car(String company, String model, String colour, String max_speed) {
        this.company = company;
        this.model = model;
        this.colour = colour;
        this.max_speed = max_speed;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(String max_speed) {
        this.max_speed = max_speed;
    }

    public void print()
    {
        System.out.println("This is parent class!! car");
    }


    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", max_speed='" + max_speed + '\'' +
                '}';
    }
}
