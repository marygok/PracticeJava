package day12_practices;

public class FullName {

    public static void main(String[] args) {
        capitalization("Klara","Mary");
    }



    public static void capitalization(String firstName, String lastName){

            firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1);

            lastName = (""+lastName.charAt(0)).toUpperCase() + lastName.substring(1);

            System.out.println(firstName + " " + lastName);
        }

    }


