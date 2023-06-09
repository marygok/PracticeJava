package day19_practices;

public class ClassMates {

    public static void main(String[] args) {

        String[] classmates = {"Mary Gok", "Klara Cydeo", "Gunay Cydeo", "Tulin Yavuz", "Cydeo School","Muhtar Cydeo", "Saim Cydeo","Adam Cydeo"};

        for (int i = 0; i < classmates.length; i++) {

            String initials = classmates[i].charAt(0) +"." +classmates[i].charAt(classmates[i].indexOf(" ")+1);
            System.out.println(initials);
        }





    }
}
