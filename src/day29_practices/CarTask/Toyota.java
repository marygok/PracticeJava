package day29_practices.CarTask;

public class Toyota extends Car{

    private String make,model,color;
    private int year;
    private double price;

    public void setInfo(String model,String color,int year, double price){
        setMake("Toyota");
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0){
            System.err.println("Invalid year: " + year);
            System.exit(1);
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}


/*
Variables:
        make, model, year, color, price

        Encapsulate all the fields
        Conditions:
        1. year can not be zero or negative
        2. price can not be zero or negative

        Methods:
        setInfo(): sets the make to "Toyota" and rest of the fields will be set based on the given arguments
        toString(): prints Toyota object info when the object is passed in the print statement

 */