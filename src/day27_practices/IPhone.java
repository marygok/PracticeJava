package day27_practices;

import java.lang.management.OperatingSystemMXBean;

public class IPhone {

    public String brand, model, size, color, madeIn, designedIn, OS;

    public double price;

    public boolean isSmartphone = true;

    static {

    }

    public IPhone(String brand, String model, String size, String color, String madeIn, String designedIn, String OS, double price, boolean isSmartphone) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.madeIn = madeIn;
        this.designedIn = designedIn;
        this.OS = OS;
        this.price = price;
        this.isSmartphone = isSmartphone;
    }

    public void printOperatingSystem(){
        System.out.println("OperatingSystem: " + this.OS);
    }
    public void call(long phoneNumber){
        System.out.println("Calling: " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("Texting: " + phoneNumber);
    }

    public void faceTime(long phoneNumber){
        System.out.println("FaceTime: " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println("FaceTime: " + email);
    }


    public String toString() {
        return "IPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", designedIn='" + designedIn + '\'' +
                ", OS='" + OS + '\'' +
                ", price=" + price +
                ", isSmartphone=" + isSmartphone +
                '}';


    }
}


/*
 Create a class named Iphone

            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
 */