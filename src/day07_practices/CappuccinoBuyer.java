package day07_practices;

public class CappuccinoBuyer {

    public static void main(String[] args) {
        String size = "grande";
        double price = 0.0;
        int calories = 0;

        if(size == "tall" || size == "grande" || size == "venti"){

            if(size == "tall"){
                price = 3.69;
                calories = 90;
            }else if(size == "grande"){
                price = 3.99;
                calories = 120;
            }else{
                price = 4.29;
                calories = 150;
            }

            System.out.println("Price is: $" + price+"\n"+calories + " calories");

        }else{
            System.err.println("Invalid Size: " + size);
        }


    }
}