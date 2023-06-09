package day13_practices;

public class MaxAndMin {

    public static void main(String[] args) {

        System.out.println(max(20,30) + " is the max number");
        System.out.println(min(20,30) + " is the min number");

    }

    public static int max(int num1, int num2){

        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }

    public static int min(int num1, int num2){

        if (num1 < num2){
            return num1;
        }else{
            return num2;
        }
    }
}
