package day09_practices;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Enter your gender: ");
        char gender = input.next().charAt(0);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        input.nextLine();

        System.out.println("Enter your phone number");
        long phoneNumber = input.nextLong();

        System.out.println("Enter your zip code");
        int zip = input.nextInt();

        System.out.println("Enter your School name");
        String schoolName = input.nextLine();
        input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state name");
        String stateName = input.next();

        System.out.println("Enter your building number");
        int buildingNumber = input.nextInt();
        input.nextLine();

        System.out.println("Enter your Street name");
        String streetName = input.nextLine();

        System.out.println("Full Name " + fullName);
        System.out.println("Age " + age);
        System.out.println("Gender " + gender);
        System.out.println("Phone Number " + phoneNumber);
        System.out.println("Address: " + "\n\t\t" + buildingNumber + " " + streetName + "\n\t\t" + cityName
                + ", " + stateName + " " + zip);

        input.close();

    }


}

