package day19_practices;

public class ClassMates_reverse {

    public static void main(String[] args) {

        String[] classmates = {"Mary Gok", "Klara Cydeo", "Gunay Cydeo", "Tulin Yavuz", "Cydeo School","Muhtar Cydeo", "Saim Cydeo","Adam Cydeo"};

        for (int i = 0; i < classmates.length; i++) {
            String name = classmates[i];
            String reverseName = "";

            for (int j = name.length()-1; j >= 0 ; j--) {
                reverseName += name.charAt(j);
            }

            System.out.println(reverseName);
        }





    }
}
