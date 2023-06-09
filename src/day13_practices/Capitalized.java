package day13_practices;

public class Capitalized {

    public static void main(String[] args) {

        System.out.println(title("jAvA"));

    }

    public static String title(String word){
        String result = word.substring(0,1).toUpperCase() + word.substring(1,4).toLowerCase();
        return result;
    }
}
