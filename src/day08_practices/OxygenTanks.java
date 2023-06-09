package day08_practices;

public class OxygenTanks {

    public static void main(String[] args) {

        int oxygenLevel = 55;

        String result = (oxygenLevel >= 90 && oxygenLevel <= 100)? "Your tank is full" :(oxygenLevel >= 80 && oxygenLevel <90)? "Still okay"
                :(oxygenLevel >= 70 && oxygenLevel < 80)? "Don't go too far" :(oxygenLevel >= 60 && oxygenLevel < 70 )? "Start to head back"
                :(oxygenLevel >= 50 && oxygenLevel <60)?  "Be careful now you at 50%" : "invalid";

        System.out.println(result);

    }
}
