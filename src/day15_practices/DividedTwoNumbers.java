package day15_practices;

public class DividedTwoNumbers {

    public static void main(String[] args) {

        int a = 100;
        int b = 5;

        int count = 0; // 1, 2.... 20

        while (a >= b) {
            a -= b; // a-b // 100-5 = 95 , 95-5 = 90;
            count++;
        }

        System.out.println(count + " with a remainder of " + a);



       }

    }

