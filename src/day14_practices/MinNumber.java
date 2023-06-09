package day14_practices;

import java.util.Scanner;

public class MinNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 2147483647;

        for (int i = 1; i < 6; i++) {
            System.out.println("Please enter number " + i);
            int num = input.nextInt();

            if (num < min){
                min = num;
            }
        }

        input.close();
        System.out.println("Smallest number entered was " + min);
    }
}
