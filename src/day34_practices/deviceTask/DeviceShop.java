package day34_practices.deviceTask;

public class DeviceShop {

    public static void main(String[] args) {
        Computer computer = new Computer("Apple", "Imac","Large",2500,"Silver",true);
        Google google = new Google("Google","Google Pixel","Medium",1250,"Black",true);
        Iphone iphone = new Iphone("Apple", "Iphone 13","Mini",1000,"Black",true);
        Samsung samsung = new Samsung("Samsung","P30","Medium",230,"Pink",true);

        System.out.println(computer);
        System.out.println(google);
        System.out.println(iphone);
        System.out.println(samsung);


    }
}

