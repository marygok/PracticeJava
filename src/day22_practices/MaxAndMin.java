package day22_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxAndMin {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5));

        int max = numbers.get(0);
        int min = numbers.get(0);

        for (Integer each : numbers) {
            if (each > max){
                max = each;
            }
            if (each < min){
                min = each;
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);



    }
}



/*
Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];
            output:
                Maximum number is 5
                Minimum number is 1
 */
