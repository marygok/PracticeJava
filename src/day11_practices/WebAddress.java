package day11_practices;

public class WebAddress {

    public static void main(String[] args) {

        String url = "www.amazon.com";

        boolean isValid = url.startsWith("www.") &&
                ( url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov"));

        if (isValid){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }

    }

}