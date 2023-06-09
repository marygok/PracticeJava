package day20_practices;

public class ReverseNegative {

    public static void main(String[] args) {

        System.out.println(reverseNumber(-3));


    }

    public static int reverseNumber(int num){

        String str = new StringBuilder("" + num).reverse().toString();

        if (num < 0){
            str = "-" + str.substring(0,str.length()-1);
        }

        return Integer.valueOf(str);
    }

}
