package day34_practices.deviceTask;

public class Google extends Phone implements Downloadable, AndroidApps{


    public Google(String brand, String model, String size, double price, String color, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" is downloading the application from "+appStoreName);
    }
}

